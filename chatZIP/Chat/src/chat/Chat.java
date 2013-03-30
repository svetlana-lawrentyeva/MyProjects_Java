/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Chat{

  

    public static void main(String[] args) {
        System.out.println("Program starting...");
        try {
            ServerSocket ss = new ServerSocket(9222);
            System.out.println("Server starting...");
            while(true){
                Socket s = ss.accept();
                SocketThread socketThread = new SocketThread(s);
                Thread t = new Thread(socketThread);
                t.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

   
}
