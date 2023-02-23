import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class CClient {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)throws IOException {
        Socket s = new Socket("localhost",8080);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());

        dos.writeUTF("You are now Connected to the Client at Port "+s.getLocalPort());
        String message = dis.readUTF();
        System.out.println("Server: "+message);
        while(!message.equalsIgnoreCase("exit")){
            System.out.print("Enter your Message: ");
            dos.writeUTF(sc.nextLine());
            message = dis.readUTF();
            System.out.println("Server: "+message);
        }
        System.out.println("Bye....");
        dos.close();
        dis.close();
        s.close();
    }
}
