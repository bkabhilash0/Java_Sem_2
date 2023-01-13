import java.util.Scanner;

public class Prg_007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 Numbers");
        System.out.print("Num 1: ");
        a = sc.nextInt();
        System.out.print("Num 2: ");
        b = sc.nextInt();
        System.out.print("Num 3: ");
        c = sc.nextInt();

        int max = (a > b) ? Math.max(a, c) : Math.max(b, c);
//        int max = (a > b) ? Math.max(a, c) : Math.max(b, c);
        System.out.println("The maximum among the 3 is "+max);
    }
}

