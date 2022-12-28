public class Complex {
    private int real;
    private int imaginary;

    void read(int real,int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    void display(){
        System.out.printf("%d + %di",this.real,this.imaginary);
    }

//    void add(Complex ){
//
//    }
}
