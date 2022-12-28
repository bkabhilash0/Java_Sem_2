
public class Main {
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Provide Command Line Arguments!");
            return;
        }
        int limit = Integer.parseInt(args[0]);
        int pro = 1;
        for (int i = 1; i <= limit; i++) {
            pro *= i;
        }
        System.out.printf("The product of first %d numbers is %d%n",limit,pro);
    }
}