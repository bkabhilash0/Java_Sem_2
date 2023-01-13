import java.util.Scanner;

public class Code_22 {
    static Scanner sc = new Scanner(System.in);
    Complex num1;

    void read(){
        System.out.println("Enter the Complex Number");
        System.out.print("Enter the real Part");
        int a = sc.nextInt();
        System.out.print("Enter the Imaginary Part");
        int b = sc.nextInt();
        num1 = new Complex(a,b);
    }

    void add(){
        System.out.println("Enter the first Complex Number");
        read();
        System.out.println("Enter the second complex number");

    }



     static void menu() {
        Code_22 obj = new Code_22();
        System.out.println("Complex Numbers");
        System.out.println("1. Read a Complex Number");
        System.out.println("2. Display the Complex Number");
        System.out.println("3. Add 2 Complex Numbers");
        System.out.println("4. Multiply two Complex Numbers");
        System.out.println("5. Exit");

        int ch;
        System.out.println("Enter a Choice");
        try {
            ch = sc.nextInt();
        } catch (Exception e){
            System.out.println("Enter a Valid Choice...");
            return;
        }
        switch(ch){
            case 1 -> obj.read();
            case 2 -> {
                if(obj.num1 == null){
                    System.out.println("Enter the Complex number first");
                }else{
                    obj.num1.display();
                }
            }
            case 3->
            default -> System.out.println("Enter a Valid Choice");
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
