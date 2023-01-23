import java.util.Scanner;

public class Pro_002 {
    static Scanner sc = new Scanner(System.in);

    static void checkPrime(int n) throws PrimeNumberException {
        if (n == 1 || n == 3 || n == 2) {
            throw new PrimeNumberException("The Number is a Prime Number");
        } else if (((n * n) - 1) % 24 == 0) {
            throw new PrimeNumberException("The Number is a Prime Number");
        } else {
            System.out.println("The Number is not a Prime Number");
        }
    }

    public static void main(String[] args) {
        int n, ch;
        while (true) {
            System.out.println("1. Enter a Number");
            System.out.println("2. Exit");
            ch = sc.nextInt();

            if (ch == 2) {
                break;
            }
            try {
                n = sc.nextInt();
                checkPrime(n);
            } catch (PrimeNumberException p) {
                System.out.println("Error: " + p.getMessage());
            } catch (Exception e) {
                System.out.println("An Error has Occurred! Try Again!");
            }
        }
    }
}
