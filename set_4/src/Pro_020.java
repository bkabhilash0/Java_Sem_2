import java.util.Scanner;

public class Pro_020 {
    int fact(int n){
        if(n ==  1){
            return 1;
        }else{
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        System.out.println("The Factorial is "+new Pro_020().fact(sc.nextInt()));
    }
}
