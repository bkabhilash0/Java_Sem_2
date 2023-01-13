public class Complex {
    private final int real;
    private final int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void display(){
        System.out.println("The Complex Number is "+real+" + "+imaginary+"i");
    }

    void add(Complex c){
        int a = this.real + c.real;
        int b = this.imaginary + c.imaginary;
        System.out.println("The sum is "+a+" + "+b+"i");
    }

    void multiply(Complex c){
        int a = (this.real*c.real) - (this.imaginary * c.imaginary);
        int b = (this.real*c.real) + (this.imaginary * c.imaginary);
        System.out.println("The Product is "+a+" + "+b+"i");
    }
}
