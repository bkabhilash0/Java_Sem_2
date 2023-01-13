// A dog is an Animal => IS-A Relationship
public class Dog extends Animal{
    String breed;

    public Dog(String name, int no_of_legs, String breed) {
        super(name, no_of_legs);
        this.breed = breed;
    }
}
