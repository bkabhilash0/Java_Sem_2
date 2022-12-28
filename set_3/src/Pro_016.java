import java.util.Scanner;

public class Pro_016 {
    static Scanner sc = new Scanner(System.in);

    void calculateSum(){
        System.out.print("Enter the value of n i.e the end limit: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum += (2*i);
        }
        System.out.println("The sum of first "+n+" even numbers is "+sum);
    }

    public static void main(String[] args) {
        Pro_016 obj = new Pro_016();
        obj.calculateSum();
    }
}
