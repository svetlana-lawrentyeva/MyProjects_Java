package com.lawsvet.chatclientandroid;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

import android.os.AsyncTask;

public class ChatClient extends AsyncTask<Void, Void, Void>{

	SocketInputThread.OnMessageReceiveListener listener;
	//PipedOutputStream pos;
    //public ChatClient(SocketInputThread.OnMessageReceiveListener listener, PipedOutputStream pos) {
    public ChatClient(SocketInputThread.OnMessageReceiveListener listener) {
        this.listener=listener;
        //this.pos=pos;
    }

	@Override
	protected Void doInBackground(Void... arg0) {
		try {
            Socket s = new Socket("192.168.0.103",9222);
            Thread threadIn = new Thread(new SocketInputThread(s, listener));
            //Thread threadOut = new Thread(new SocketOutputThread(s,pos));
            Thread threadOut = new Thread(new SocketOutputThread(s, listener));
            threadIn.start();
            threadOut.start();
        } catch (UnknownHostException ex) {
            Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
        }
		return null;
	}
}
