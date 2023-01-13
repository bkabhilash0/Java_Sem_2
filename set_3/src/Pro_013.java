// Sum of Series 1+(1+2)+(1+2+3)+(1+2+3+...+n) using single while loop

import java.util.Scanner;

public class Pro_013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum = 0,i = 1;
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        while(i <= n+1){
            sum += i;
            System.out.print(sum+"\t");
            i++;
        }
    }
}
