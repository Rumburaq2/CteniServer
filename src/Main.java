import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10000);


        while(true) {
            //Socket socket = server.accept();
            //Socket sc = new Socket("192.168.82.8", 10000);
            try (Socket s = server.accept()) {
                BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                for (; ; ) {
                    String line = in.readLine();
                    if (line.length() == 0)
                        break;
                    System.out.println(line);
                }
                in.readLine();
                System.out.println("mame support");
            }
        }
    }
}