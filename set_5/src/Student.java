public class Student extends Teacher {
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void getRole() {
        System.out.println("I am a Student from "+grade+"th grade");
    }
}
