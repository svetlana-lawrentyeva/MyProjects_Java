package testclient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestClient
{
	
	Socket requestSocket;
	ObjectOutputStream out;
 	ObjectInputStream in;
 	String message;
	TestClient(){}
	void run() throws ClassNotFoundException
	{
		try{
			//1. creating a socket to connect to the server
			requestSocket = new Socket(c, 2004);
			System.out.println("Connected to localhost in port 2004");
			//2. get Input and Output streams
			out = new ObjectOutputStream(requestSocket.getOutputStream());
			out.flush();
			in = new ObjectInputStream(requestSocket.getInputStream());
                        Scanner input=new Scanner(System.in);
			//3: Communicating with the server
			do{
				
					message = (String)in.readObject();
					System.out.println("server>" + message);                                        
//					sendMessage("Hi my server, i'm "+requestSocket.getLocalAddress() + ", port: "+requestSocket.getLocalPort());
                                        
                                        message=input.nextLine();
					sendMessage(message);
                                        //System.out.println("client>"+message);
				
                        //}while(true);
			}while(!message.equals("0"));
		}
		catch(UnknownHostException unknownHost){
			System.err.println("You are trying to connect to an unknown host!");
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
		finally{
			//4: Closing connection
			try{
				in.close();
				out.close();
				requestSocket.close();
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
			System.out.println("client>" + msg);
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	public static void main(String args[]) throws ClassNotFoundException
	{
		TestClient client = new TestClient();
		client.run();
	}
}