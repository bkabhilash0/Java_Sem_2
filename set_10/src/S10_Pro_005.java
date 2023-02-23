import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class S10_Pro_005 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("sample.txt");
        File f2 = new File("target.txt");
        if(!f2.exists()){
            f2.createNewFile();
        }

        FileInputStream fis = new FileInputStream(f1);
        FileOutputStream fos = new FileOutputStream(f2);

        byte f1_data[] = fis.readAllBytes();

        fos.write(f1_data);

        fis.close();
        fos.close();
    }
}
