package client;

import java.net.Socket;

public class JChaTServerThread implements Runnable {

    private Socket socket;

    public JChaTServerThread(Socket socket) {
        this.socket= socket;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

}
