import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args)throws IOException {
        Socket s = new Socket("localhost",8080);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        String message = "Hello server";
        dos.writeUTF(message);

        dos.close();
        s.close();
    }
}
