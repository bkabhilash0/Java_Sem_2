import java.lang.Math;

class Player{
    final String name;
    int hitpoints;

    Player(String name,int hitpoints){
        this.name = name;
        this.hitpoints = hitpoints;
    }

    void run(){
    }

    void attack(){}

    static void increaseHealth(){}

    void decreaseHealth(int h){
        this.hitpoints = this.hitpoints - h;
    }

    void printBio(){
        System.out.println("Inside Class Hashcode "+this.hashCode());
        System.out.println("Name "+name);
        System.out.println("Hitpoints "+hitpoints);
    }

}

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Hello",100);
        Player p2 = new Player("World",100);
        Player.increaseHealth();
        System.out.println(Math.PI);

    }
}