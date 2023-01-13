public class Code_023 {

    static int a = 10;

    static void getInfo(){
        System.out.println("This is a static function!");
    }


    public static void main(String[] args) {
        Code_023 obj = new Code_023();
        getInfo();
        Code_023.getInfo();
        System.out.println(Code_023.a);
        System.out.println(obj.a);
        Code_023.a = 20;
        System.out.println(Code_023.a);
        System.out.println(obj.a);
    }
}
