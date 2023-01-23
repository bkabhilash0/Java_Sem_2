public class Pro_002 {
    public static void main(String[] args) throws CloneNotSupportedException{
        // Deep Cloning
        Distance d1 = new Distance(10,20);
        System.out.println(d1.feet);
        Distance d2 = d1.clone();
        System.out.println(d2.feet);
        d2.feet = 50;
        System.out.println(d1.feet);
        System.out.println(d2.feet);
    }
}
