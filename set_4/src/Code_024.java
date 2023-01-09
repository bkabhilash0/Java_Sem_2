import java.util.Scanner;

public class Code_024 {
    static void printEven(int n){
        for(int i=0;i <=n; i+=2){
            System.out.println(i);
        }
    }
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Limit of the Numbers");
        Code_024.printEven(sc.nextInt());
    }
}
