package com.lawsvet.chatclientandroid;

import java.io.IOException;
import java.io.PipedOutputStream;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;

public class ChatActivity extends Activity implements SocketInputThread.OnMessageReceiveListener {

	EditText chatText;
	EditText inputText;
	public String message="";
	//PipedOutputStream pos;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chat);
		chatText=(EditText)findViewById(R.id.editTextChat);
		inputText=(EditText)findViewById(R.id.editTextMine);
		//pos=new PipedOutputStream();
		String str="";
		try
		{
		//new ChatClient(this, pos).execute();
		new ChatClient(this).execute();
		}
		catch(Exception ex)
		{
			str=ex.getMessage();
		}
		//message="fycyc";
		//byte[]buffer=message.getBytes();
		//try {
			//pos.write(buffer);
			//pos.flush();
		//} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		String l=str;
	}

	@Override
	public void messageShow(String message) {
		String chatT=chatText.getText()+"\n"+message;
		chatText.setText(chatT);
		}
	public void onClick(View v)
	{
		message=inputText.getText().toString();
		inputText.setText("");
		String chatT=chatText.getText()+"\n"+message;
		chatText.setText(chatT);
		//byte[]buffer=message.getBytes();
		//try {
			//pos.write(buffer);
			//pos.flush();
		//} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
	}

	@Override
	public String getOutMessage() {
		return message;
	}

	@Override
	public void cleanOutMessage() {
		message="";
	}
}
