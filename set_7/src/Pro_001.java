import java.util.Scanner;

public class Pro_001 {
    static Scanner sc = new Scanner(System.in);
    CString str = new CString();
    String word;

    public Pro_001(String str) {
        this.word = str;
    }

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
                sc.nextLine();
                str = new CString(sc.nextLine());
            }
            case 2-> {
                str.display();
            }
            case 3 ->{
                System.out.println("Enter the String to Compare");
                sc.nextLine();
                if(str.compare(sc.nextLine())){
                    System.out.println("The Strings are equal");
                }else{
                    System.out.println("The Strings aren't equal");
                }

            }
            case 4-> {
                System.out.println("Enter the String to Concat");
                sc.nextLine();
                System.out.println("The new String is "+str.concat(sc.nextLine()));
            }
            case 5-> {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Pro_001 obj = new Pro_001("");
        while(obj.menu()){};
    }
}
