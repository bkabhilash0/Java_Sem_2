class Triangle implements Geometry {
    @Override
    public void area(int l, int b, int h) {
        double area = 0.5 * l * b * h;
        System.out.println("Area is "+area);
    }
}


public class Prg_003 {
    public static void main(String[] args) {
        Geometry t = new Triangle();
        t.area(10,20,30);
    }
}
