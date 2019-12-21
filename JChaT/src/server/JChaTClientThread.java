package server;

import java.net.Socket;

public class JChaTClientThread extends JChaTServer implements Runnable {

    private Socket socket;

    public JChaTClientThread(Socket socket) {
        this.socket= socket;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

}
