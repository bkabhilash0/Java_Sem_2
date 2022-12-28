import java.util.Scanner;

public class Rec_Num {
    int count;

    int split(int n){
        if(n > 0){
            count++;
            System.out.println("Recursion "+count+" => Number is => "+n);
            return split(n / 10);
        }else{
            return count;
        }
    }

    int numOfDigits(int n){
        int count = 0;

        while(n > 0){
            count++;
            n = n / 10;
        }

        return count;
    }

    void strSplit(String s){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");

        int n = sc.nextInt();
        Rec_Num obj =  new Rec_Num();
        int d = obj.numOfDigits(n);
        int count = obj.split(n);

        System.out.println("No of Digits = "+d);
        System.out.println("No of Recursion = "+count);

        if(d == count){
            System.out.println("Both are Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
