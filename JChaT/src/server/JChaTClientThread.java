package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class JChaTClientThread extends JChaTServer implements Runnable {

    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public JChaTClientThread(Socket socket) {
        this.socket= socket;
    }

    @Override
    public void run() {
        try {
            in= new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out= new PrintWriter(socket.getOutputStream(), true);

            while (!socket.isClosed()) {
                String input= in.readLine();
                if (input != null) {
                    for (JChaTClientThread client : clients) {
                        client.getWriter().write(input);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private PrintWriter getWriter() {
        return out;
    }

}
