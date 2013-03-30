package com.lawsvet.chatclientandroid;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocketInputThread implements Runnable {

	public interface OnMessageReceiveListener
	{
		public void messageShow(String message);
		public String getOutMessage();
		public void cleanOutMessage();
	}
    private Socket s = null;
    private Scanner in = null;
    private String inMessage = null;
    private OnMessageReceiveListener listener;

    public SocketInputThread(Socket s, OnMessageReceiveListener listener) {
        this.s = s;
        this.listener=listener;
    }

    @Override
    public void run() {
        try {
            in = new Scanner(s.getInputStream());
            while(true){
                if(in.hasNext()){
                 inMessage = in.nextLine();
                 listener.messageShow(inMessage);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(SocketInputThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

