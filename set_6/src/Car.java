// Car has an Engine => HAS-A relationship

public class Car {
    String brand;
    String model;
    int price;
    Engine engine;

    public Car(String brand, String model, int price, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.engine = engine;
    }

    void showInfo(){
        System.out.println("Car Details");
        System.out.println("Brand: "+this.brand);
        System.out.println("Model: "+this.model);
        System.out.println("price: "+this.brand);
        System.out.println("Engine Details");
        System.out.println("Engine Model: "+this.engine.model_no);
        System.out.println("Engine type: "+this.engine.type);
        System.out.println("Engine Capacity "+this.engine.capacity);
    }
}
