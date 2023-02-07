// throw and Finally

import java.util.Scanner;

public class Pro_003 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a Number");
        try{
            n = sc.nextInt();
        }catch (Exception e){
            System.out.println("Enter a Valid Number");
        }finally{
            System.out.println("Exiting the Program....");
        }
    }
}
