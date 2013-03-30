package chatserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatServer
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket ss=new ServerSocket(9222);
            
            while(true)
            {
                Socket s=ss.accept();
                ServerThread st=new ServerThread(s);
                Thread t=new Thread(st);
                t.start();
            }
            
        } catch (IOException ex)
        {
            Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
