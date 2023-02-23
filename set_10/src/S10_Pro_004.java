import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class S10_Pro_004 {
    public static void main(String[] args) throws IOException {
        File f = new File("sample.txt");
        FileInputStream fis = new FileInputStream(f);
        BufferedInputStream bis = new BufferedInputStream(fis);

        byte[] data = bis.readAllBytes();
        String message = new String(data);
        String[] words = message.split("\n");
        System.out.println("The number of lines in the file is "+words.length);
        System.out.println("Number of Characters : "+f.length());

        int count = 0;
        for(String w:words){
            count += w.split(" ").length;
        }

        System.out.println("Total Number of Words: "+count);

        fis.close();
    }
}
