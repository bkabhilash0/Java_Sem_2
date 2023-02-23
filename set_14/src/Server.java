import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class Server{
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String mess = dis.readUTF();
        System.out.println("The message from the Client is "+mess);

        dis.close();
        s.close();
        ss.close();
    }
}