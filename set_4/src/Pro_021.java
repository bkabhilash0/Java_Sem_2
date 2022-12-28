// n to 1 and vice versa using recursion

import java.util.Scanner;

public class Pro_021 {
    void nTo1(int n){
        if(n == 1){
            System.out.print(n+"\n");
        }else{
            System.out.print(n+"\t");
            nTo1(n - 1);
        }
    }

    void oneToN(int i,int n){
        if(i == n){
            System.out.print(i+"\n");
        }else{
            System.out.print(i+"\t");
            oneToN(i+1,n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n: ");
        int n = sc.nextInt();
        Pro_021 obj = new Pro_021();
        System.out.println("n to 1 is ");
        obj.nTo1(n);;
        System.out.println("1 to n is ");
        obj.oneToN(1,n);
    }
}
