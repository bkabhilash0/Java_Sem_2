public class Prg_2 {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Provide 2 or more Command Line Arguments!");
            System.out.println("Exiting....");
            return;
        }
        try{
            int limit = Integer.parseInt(args[0]);
            if(limit > args.length-1){
                throw new Exception("Number of Args must be equal to or More than the limit");
            }
            int product = 1;
            for(int i = 1; i <= limit; i++){
                product *= Integer.parseInt(args[i]);
            }
            System.out.println("The Product of first "+limit+" args is "+product);
        }catch(NumberFormatException e){
            System.out.println("Enter Valid Numbers!");
        }catch(Exception e){
            System.out.println(e.getMessage() != null ? e.getMessage() : " Something Went Wrong!");
        }finally {
            System.out.println("Exiting....");
        }
    }
}
