import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CServer {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        dos.writeUTF("You are now Connected to the Server at Port "+s.getLocalPort());
        String message = "";
        message = dis.readUTF();
        System.out.println("Client: "+message);
        while(!message.equalsIgnoreCase("exit")){
            message = dis.readUTF();
            System.out.println("Client: "+message);
            System.out.print("Enter a Message : ");
            dos.writeUTF(sc.nextLine());
        }
        System.out.println("Bye...");
        dos.close();
        dis.close();
        s.close();
        ss.close();
    }
}
