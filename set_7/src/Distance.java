public class Distance implements Cloneable{
    int inch;
    int feet;

    public Distance(int inch, int feet) {
        this.inch = inch;
        this.feet = feet;
    }

    void calc(){
        System.out.println("The distance is "+this.inch*this.feet);
    }

    @Override
    public Distance clone() throws CloneNotSupportedException{
        return (Distance) super.clone();
    }
}
