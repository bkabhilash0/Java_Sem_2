// Call by Value

import java.util.Scanner;

public class Pro_005 {
    static Scanner sc = new Scanner(System.in);

    void swap(float a,float b){
        float tmp = a;
        a = b;
        b = tmp;

        System.out.println("After swapping, inside the swap method");
        System.out.printf("a = %f and b = %f\n",a,b);
    }

    public static void main(String[] args) {
        float a,b;
        System.out.println("Enter 2 numbers to swap Using Call by Value");
        a = sc.nextFloat();
        b = sc.nextFloat();

        System.out.println("Before Swapping, the values are");
        System.out.printf("a = %f and b = %f\n",a,b);

        // Perform Swapping
        new Pro_005().swap(a,b);

        // After Swapping
        System.out.println("After Swapping, the values in the main method are");
        System.out.printf("a = %f and b = %f\n",a,b);
    }
}
