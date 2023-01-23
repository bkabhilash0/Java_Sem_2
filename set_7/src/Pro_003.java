import java.util.Scanner;

public class Pro_003 {
    static Scanner sc = new Scanner(System.in);
    String str = "";
    boolean menu(){
        System.out.println("String Program");
        System.out.println("1. Enter a new String");
        System.out.println("2. Display the Length");
        System.out.println("3. Compare 2 Strings");
        System.out.println("4. Convert to Uppercase and Lower Case");
        System.out.println("5. Exit..");

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
                sc.nextLine();
                str = sc.nextLine();
            }
            case 2-> {
                System.out.println("The length is "+str.length());
            }
            case 3 ->{
                System.out.println("Enter the String to Compare");
                sc.nextLine();
                if(str.compareTo(sc.nextLine()) == 0){
                    System.out.println("The Strings are equal");
                }else{
                    System.out.println("The Strings aren't equal");
                }

            }
            case 4-> {
                System.out.println("The String in lowercase is "+str.toLowerCase());
                System.out.println("The String in uppercase is "+str.toUpperCase());
            }
            case 5-> {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       Pro_003 obj = new Pro_003();
       while(obj.menu()){}
    }
}
