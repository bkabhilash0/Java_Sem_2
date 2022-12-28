// Sum of 1+(2/2!)+(3/3!)+.....+(n/n!)

import java.util.Scanner;

public class Pro_014 {
    static float factorial(int n){
        int res = 1;
        while(n != 0){
            res *= n;
            n--;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum=0f,n;
        System.out.print("Enter the Value of n: ");
        n = sc.nextInt();

        for(int j=1;j<=n;j++){
            sum += j/factorial(j);
        }

        System.out.println("The sum of series is "+sum);
    }
}
