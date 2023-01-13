public class Pro_001 {

    public static void main(String[] args) {
        Dog d1 = new Dog("Jimmy",2,"German Shepard");
        Engine bmw_engine = new Engine("B-001","Petrol",10);
        Car bmw = new Car("BMW","M3 GTR",4000000,bmw_engine);
        bmw.showInfo();
    }
}