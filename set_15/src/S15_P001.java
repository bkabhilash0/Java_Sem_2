import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class S15_P001 {
    public static void main(String[] args) throws IOException {
        URL u = new URL("https://www.javatpoint.com/java-url-getfile-method");
        URLConnection uc = u.openConnection();
        System.out.println("Protocol is "+u.getProtocol());
        System.out.println("File Name: "+u.getFile());
        System.out.println("Host is: "+u.getHost());
        System.out.println("Path is "+u.getPath());
        System.out.println("Port is "+u.getDefaultPort());

        System.out.println(uc.getHeaderFields());
        InputStream is = uc.getInputStream();
//        int c;
//        while((c = is.read()) != -1){
//            System.out.print((char)c);
//        }
        is.close();

    }
}
