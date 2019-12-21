package client;

import java.io.IOException;
import java.net.Socket;

public class JChaTClient {

    final static int portNumber= 3000;

    public static void main(String[] args) {
        Socket socket= null;
        try {
            socket= new Socket("localhost", portNumber);
        } catch (IOException e) {
            System.err.println("Fatal connection error!");
            e.printStackTrace();
        }

    }

}
