package server;

import java.io.IOException;
import java.net.ServerSocket;

public class JChaTServer {

    final static int portNumber= 3000;

    public static void main(String[] args) {
        // serverSocket = null;

        try {
            ServerSocket serverSocket= new ServerSocket(portNumber);
        } catch (IOException e) {
            System.err.print("Could not listen on port " + portNumber);
            System.exit(1);

        }
    }

}
