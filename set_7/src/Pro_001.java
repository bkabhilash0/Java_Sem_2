import java.util.Scanner;

public class Pro_001 {
    static Scanner sc = new Scanner(System.in);
    CString str = new CString();
    boolean menu(){
        System.out.println("C String Program");
        System.out.println("1. Enter a new String");
        System.out.println("2. Display the String");
        System.out.println("3. Compare 2 Strings");
        System.out.println("4. Concat 2 Strings");
        System.out.println("5. Exit");

        System.out.print("Enter your Choice: ");
        int ch;
        try{
            ch = sc.nextInt();
        }catch (Exception e){
            System.out.println("Enter a valid Input");
            return true;
        }

        switch (ch){
            case 1-> {
                System.out.print("Enter your String: ");
                str = new CString(sc.nextLine());
            }
            case 2-> {
                str.display();
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
