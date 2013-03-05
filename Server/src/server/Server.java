package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server
{
    public static void main(String[] args)
    {
         System.out.println("Program starting...");
        try {
            ServerSocket serverSocket = new ServerSocket(9222);
            System.out.println("Server starting...");
            while(true){
                Socket s = serverSocket.accept(); // ожидание новых клиентов
                SocketThread socketThread = new SocketThread(s);
                Thread t = new Thread(socketThread);
                t.start(); // запуск нового потока для каждого нового клиента
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
