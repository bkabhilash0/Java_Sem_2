import java.util.Scanner;

public class Pro_006 {
    static Scanner sc = new Scanner(System.in);
    double res;

    void findSqrt(double a){
        this.res = Math.sqrt(a);
        System.out.println("The value of sqrt inside the function is "+this.res);
    }

    public static void main(String[] args) {
        Pro_006 sqrt = new Pro_006();
        System.out.println("Enter the number to find its sqrt..");
        double a = sc.nextDouble();
        System.out.println("The sqrt before call by ref is "+sqrt.res);
        sqrt.findSqrt(a);
        System.out.println("The value of sqrt in the main function is "+sqrt.res);
    }
}
