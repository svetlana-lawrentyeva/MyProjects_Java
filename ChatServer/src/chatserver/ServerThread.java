package chatserver;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerThread implements Runnable
{
    ArrayList<Socket> socketList;
    ObjectOutputStream out;
    ObjectInputStream in;
    String message;
    
    public ServerThread(Socket s)
    {
        socketList=new ArrayList<>();
    }

    @Override
    public void run()
    {
        try
        {
            out=new ObjectOutputStream(s.getOutputStream());
            in=new ObjectInputStream(s.getInputStream());
            
            
        } catch (IOException ex)
        {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
