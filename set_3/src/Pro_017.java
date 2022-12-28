import java.util.Scanner;

public class Pro_017 {
    static Scanner sc = new Scanner(System.in);

    void reverse(){
        int rev = 0;
        System.out.print("Enter the Number to reverse: ");
        int n = sc.nextInt();

        int sign = 1;
        if(n < 0){
            sign = -1;
            n = n * sign;
        }

        while(n > 0){
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }

        rev = rev * sign;
        System.out.println("The reverse of "+n+" is "+rev);
    }

    public static void main(String[] args) {
        new Pro_017().reverse();
    }
}
