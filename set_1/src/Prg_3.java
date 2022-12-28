public class Prg_3 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Provide Command Line Arguments!");
            System.out.println("Exiting....");
            return;
        }

        System.out.println("The Strings are: ");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
