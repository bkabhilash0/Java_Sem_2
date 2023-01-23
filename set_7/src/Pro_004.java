import java.util.Scanner;

public class Pro_004 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s;
        StringBuilder rev = new StringBuilder();
        System.out.print("Enter the string to reverse: ");
        s = sc.nextLine();
        int l = s.length();

        // Reverse it
        while(l > 0){
            rev.append(s.charAt(l - 1));
            l--;
        }

        System.out.println("The reverse is "+rev);
    }
}
