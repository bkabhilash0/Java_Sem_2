// Display numbers from m to n

import java.util.Scanner;

public class Pro_012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("Enter the Starting range: ");
        m = sc.nextInt();
        System.out.println("Enter the Ending Range: ");
        n = sc.nextInt();

        while(m != n){
            System.out.print(m+"\t");
            if(m > n){
                m--;
            }else{
                m++;
            }
        }

        System.out.print(n);
    }
}
