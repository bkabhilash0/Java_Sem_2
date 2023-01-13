// Method Overriding

import java.util.Arrays;

public class Code_025 {
    public static void main(String[] args) {
        // Menu Driven
        Teacher t = new Teacher("Someone",21);
        t.getRole();
        Student s = new Student("Abhi",21,10);
        s.getRole();
    }
}