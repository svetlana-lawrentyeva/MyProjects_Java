package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketThread implements Runnable
{
    ServerSocket providerSocket;
	Socket connection = null;
	ObjectOutputStream out;
	ObjectInputStream in;
	String message;
        
        String []strings={"one", "one two", "one two three"};
	SocketThread(Socket s)
        {
            connection=s;
        }
	public void run()
	{
		try{
			System.out.println("Waiting for connection");
			System.out.println("Connection received from " + connection.getInetAddress().getHostName());
			//3. get Input and Output streams
			out = new ObjectOutputStream(connection.getOutputStream());
			out.flush();
			in = new ObjectInputStream(connection.getInputStream());
			sendMessage("Connection successful");
			//4. The two parts communicate via the input and output streams
			do{
				try{
					message = (String)in.readObject();
					System.out.println("client>" + message);
                                        int count=Integer.parseInt(message);
					if (count<0||count>3)
                                        {
						sendMessage("error");
                                                System.out.println("server>error");
                                        }
                                        else
                                        {
                                            sendMessage(strings[count-1]);
                                                //System.out.println("server>"+strings[count-1]);
                                        }
				}
				catch(ClassNotFoundException classnot){
					System.err.println("Data received in unknown format");
				}
			}while(!message.equals("0"));
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
		finally{
			//4: Closing connection
			try{
				in.close();
				out.close();
				providerSocket.close();
			}
			catch(IOException ioException){
				ioException.printStackTrace();
			}
		}
	}
	void sendMessage(String msg)
	{
		try{
			out.writeObject(msg);
			out.flush();
			System.out.println("server>" + msg);
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
}
