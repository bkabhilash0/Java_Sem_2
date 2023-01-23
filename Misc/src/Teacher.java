public  class Teacher {
    String name;
    int age;
    String dep;

    private double salary;

    public Teacher(String name, int age, String dep,double salary) {
        this.name = name;
        this.age = age;
        this.dep = dep;
        this.salary = salary;
    }
    public Teacher(String name, int age, String dep) {
        this.name = name;
        this.age = age;
        this.dep = dep;
    }

    void printInfo(){
        System.out.println("I am a Teacher");
    }
}

class Student extends Teacher{
    int grade;
    int marks;

    Student(String name,int age,String dep,int grade,int marks){
        super(name,age,dep);
        this.grade = grade;
        this.marks = marks;
    }

    void printTeacher(){
        System.out.println(super.name);
    }

    void printInfo(){
        System.out.println("I am a Student");
    }
}

class Work{
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Frangelo",50,"CS",50000);
        Student s1 = new Student("Hello",21,"CS",12,9);
        s1.printTeacher();
//        t1.printInfo();
//        s1.printInfo();
    }
}