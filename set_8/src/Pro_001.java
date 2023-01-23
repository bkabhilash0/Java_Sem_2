import java.util.Scanner;

public class Pro_001 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of the Array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];

        for(int i=0;i < l;i++){
            sc.nextLine();
            try{
                arr[i] = sc.nextInt();
            }catch (NumberFormatException n){
                System.out.println("Enter a Valid Number!");
            }catch(Exception e){
                System.out.println("Error ");
            }
        }
    }
}