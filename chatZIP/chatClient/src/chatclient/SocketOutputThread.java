/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chatclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    private Socket s = null;
    private PrintWriter out = null;
    private String outMessage = null;
    private String name;

    public SocketOutputThread(Socket s) {
        this.s = s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ваше имя: ");
        name=sc.nextLine();
    }

    @Override
    public void run() {
        try {
            out = new PrintWriter(s.getOutputStream());
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            out.println(name);
            out.flush();
            while (true) {
                outMessage = buffer.readLine();
                out.println(name+"> "+outMessage);
                out.flush();
            }
        } catch (IOException ex) {
            Logger.getLogger(SocketOutputThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
