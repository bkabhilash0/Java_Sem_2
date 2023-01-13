import java.util.Scanner;

class Circle implements Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void disp() {
        System.out.println("Shape is => Circle");
    }

    @Override
    public void calc() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the Circle with radius " + radius + " is " + area);
    }
}

class Rectangle implements Shape {
    int l, b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public void disp() {
        System.out.println("Shape is => Rectangle");
    }

    @Override
    public void calc() {
        double area = l * b;
        System.out.println("The area of the rectangle with l=" + l + " and b=" + b + " is " + area);
    }
}

public class Pro_004 {
    static Scanner sc = new Scanner(System.in);
    static boolean menu(){
        Shape sh= null;
        System.out.println("Find area of Shapes");
        System.out.println("Choose the desired Shape");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Exit");

        System.out.print("Enter your Choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1 -> {
                System.out.println("Creating a Circle...");
                System.out.print("Enter the radius of the Circle: ");
                try {
                    sh = new Circle(sc.nextInt());
                } catch (Exception e) {
                    System.out.println("Enter a Valid Input!!!");
                }
                System.out.println("Created a Circle");
            }
            case 2 -> {
                System.out.println("Creating a Rectangle");
                System.out.print("Enter the length and breath of the Rectangle: ");
                try {
                    sh = new Rectangle(sc.nextInt(),sc.nextInt());
                } catch (Exception e) {
                    System.out.println("Enter a Valid Input!!!");
                }
                System.out.println("Created a Rectangle");
            }
            case 3 -> {
                System.out.println("Exiting....");
                System.exit(0);
                return false;
            }
            default -> System.out.println("Enter a Valid Choice...");
        }
        // Now Print the Area
        if(sh != null){
            sh.calc();
        }else{
            System.out.println("Something went Wrong...");
        }
        return true;
    }
    public static void main(String[] args) {
        while(menu()) {
        }
    }
}
