package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class JChaTServer {

    private static final int portNumber= 3000;
    protected static List<JChaTClientThread> clients;
    private static ServerSocket serverSocket;

    public static void main(String[] args) {
        serverSocket= null;

        try {
            serverSocket= new ServerSocket(portNumber);
            acceptClients();
        } catch (IOException e) {
            System.err.println("Could not listen on port " + portNumber);
            System.exit(1);

        }
    }

    public static void acceptClients() {
        clients= new ArrayList<JChaTClientThread>();
        while (true) {
            try {
                Socket socket= serverSocket.accept();
                JChaTClientThread client= new JChaTClientThread(socket);
                Thread thread= new Thread(client);
                thread.start();
                clients.add(client);
            } catch (IOException e) {
                System.out.println("Accept failed on: " + portNumber);
            }

        }
    }

}
