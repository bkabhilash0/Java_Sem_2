package set_10.src;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Pro_001 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Path to view the files: ");
        File fos = new File(sc.nextLine());
        System.out.println(Arrays.toString(fos.list()));
    }
}
