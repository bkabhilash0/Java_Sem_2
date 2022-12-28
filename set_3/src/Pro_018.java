// Sum of digits using arg and return type

import java.util.Scanner;

public class Pro_018 {
    static Scanner sc = new Scanner(System.in);

    int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        System.out.println("Sum of Digits is " + new Pro_018().sumOfDigits(sc.nextInt()));
    }
}
