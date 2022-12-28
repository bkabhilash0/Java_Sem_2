import java.util.Scanner;

public class prg_008 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = new int[]{5,4,6,3,1};
        int key;
        System.out.print("Enter the Number to search: ");
        key = sc.nextInt();

        for(int i:nums){
            if(i == key){
                System.out.println("Found the Number");
                return;
            }
        }

        System.out.println("Element Not found!");
    }
}
