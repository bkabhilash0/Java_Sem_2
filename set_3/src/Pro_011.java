// Check for Integer Palindrome

import java.util.Scanner;

public class Pro_011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int rev = 0, n = num;

        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }

        System.out.println(String.format("The Number %d is ", num) + (num == rev ? "a Palindrome!" : "not a Palindrome"));
    }
}
