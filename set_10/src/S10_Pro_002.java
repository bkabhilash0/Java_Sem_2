// Search for a Given File name in a dir

import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class S10_Pro_002 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Where do u want to search the files: ");
        String path = sc.nextLine();

        File f = new File(path);
        System.out.println("Searching in the Directory " + f.getAbsolutePath());

        System.out.println("Enter the Name of the file to search: ");
        String fname = sc.nextLine();

        if (f.list() == null) {
            System.out.println("No File Found in the Specified Directory");
            return;
        }

        int index = Arrays.binarySearch(Objects.requireNonNull(f.list()), fname);

        if (index < 0) {
            System.out.println("No File with the name " + fname + " is Found in the Specified Directory");
        } else {
            System.out.println("The file " + fname + " is found in the directory");
        }
    }
}
