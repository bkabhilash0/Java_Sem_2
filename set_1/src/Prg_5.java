import java.util.Scanner;

public class Prg_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Before Swapping - the values are");
            System.out.println("The value of a is "+a);
            System.out.println("The value of b is "+b);

            // Swapping
            a = a^b;
            b = a^b;
            a = a^b;

            System.out.println("Before Swapping - the values are");
            System.out.println("The value of a is "+a);
            System.out.println("The value of b is "+b);
        }catch(Exception e){
            System.out.println("Enter valid Numbers");
        }
    }
}
