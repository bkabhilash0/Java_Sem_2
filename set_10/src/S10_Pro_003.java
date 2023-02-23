// Search for a given String in a file

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class S10_Pro_003 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        File f = new File("sample.txt");
        if(!f.exists()){
            FileOutputStream fos = new FileOutputStream("sample.txt");
            String message = "This is a message";
            fos.write(message.getBytes());
            fos.close();
        }
        System.out.println("Total Characters in the file is "+f.length());
    }
}
