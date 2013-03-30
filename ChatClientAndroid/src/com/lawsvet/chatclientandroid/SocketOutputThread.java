package com.lawsvet.chatclientandroid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Администратор
 */
public class SocketOutputThread implements Runnable {

	SocketInputThread.OnMessageReceiveListener listener;
    private Socket s = null;
    private PrintWriter out = null;
    private String outMessage = null;
    private String name;
    //private PipedInputStream pis;

    //public SocketOutputThread(Socket s, PipedOutputStream pos) {
    public SocketOutputThread(Socket s, SocketInputThread.OnMessageReceiveListener listener) {
    	this.listener=listener;
        this.s = s;
        //try {
			//this.pis=new PipedInputStream(pos);
		//} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
       // Scanner sc=new Scanner(System.in);
       // System.out.print("Ваше имя: ");
        name="Lana";//sc.nextLine();
    }

    @Override
    public void run() {
        try {
            out = new PrintWriter(s.getOutputStream());
            //BufferedReader buffer = new BufferedReader(new InputStreamReader(pis));
            out.println(name);
            out.flush();
            while (true) {            	
                //outMessage = buffer.readLine();
            	outMessage=listener.getOutMessage();
            	if(outMessage!="")
            	{
	            	listener.cleanOutMessage();
	                out.println(name+"> "+outMessage);
	                out.flush();
            	}
            }
        } catch (IOException ex) {
            Logger.getLogger(SocketOutputThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}