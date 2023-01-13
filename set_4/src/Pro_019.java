// Find the max of 2 or 3 numbers using function overloading1

import java.util.Scanner;

public class Pro_019 {
    static Scanner sc = new Scanner(System.in);

    int max(int a, int b) {
        return Math.max(a, b);
    }

    // Overloaded Method
    int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else {
            return Math.max(b, c);
        }
    }

    boolean menu(){
        System.out.println("1. Find max of 2 Numbers");
        System.out.println("2. Find max of 3 Numbers");
        System.out.println("3. Exit");
        System.out.println("Enter your Choice");

        int a, b, c;
        Pro_019 obj = new Pro_019();

        switch (sc.nextInt()) {
            case 1 -> {
                System.out.println("Enter 2 Numbers: ");
                System.out.print("Number 1: ");
                a = sc.nextInt();
                System.out.print("Number 2: ");
                b = sc.nextInt();
                System.out.println("The max is " + obj.max(a, b));
            }
            case 2 -> {
                System.out.println("Enter 3 Numbers: ");
                System.out.print("Number 1: ");
                a = sc.nextInt();
                System.out.print("Number 2: ");
                b = sc.nextInt();
                System.out.print("Number 3: ");
                c = sc.nextInt();
                System.out.println("The max is " + obj.max(a, b, c));
            }
            case 3 -> {
                System.out.println("Exiting");
                System.exit(0);
            }
            default -> System.out.println("Enter a Valid Choice!");
        }
        return true;
    }

    public static void main(String[] args) {
        Pro_019 obj = new Pro_019();
        while(obj.menu()){}
    }
}
