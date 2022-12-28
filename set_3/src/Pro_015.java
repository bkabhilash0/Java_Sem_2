// Calc Area of Circle using Constructor

import java.util.Scanner;

public class Pro_015 {
    Pro_015(float radius){
        float area = (float)((2*3.14) * radius);
        System.out.println("The are of the Circle with the radius "+radius+" is "+area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat();
        Pro_015 obj = new Pro_015(radius);
    }
}
