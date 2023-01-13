import java.util.ArrayList;
import java.util.Scanner;

public class Microsoft {
    ArrayList<Employees> emps = new ArrayList<>();

    void addEmployee(){
        System.out.println("Add a New Employee...");
        Employees e = new Employees();
        emps.add(e);
        System.out.println("Employee Added Successfully");
    }

    boolean isEmpty(){
        return emps.isEmpty();
    }

    void displayAll(){
        if(isEmpty()){
            System.out.println("No Employees are Available");
            return;
        }
        System.out.println("Displaying all Employees");
        Employees.displayAll(emps);
    }

    void searchEmployee(){
        if(isEmpty()){
            System.out.println("No Employees are Available");
            return;
        }
        Employees.search(emps);
    }

    boolean menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Microsoft Employees Management");
        System.out.println("Total Employees Present: "+emps.size());
        System.out.println("Enter your Choice");
        System.out.println("1. Add a new Employee");
        System.out.println("2. Display all Employees");
        System.out.println("3. Search an Employee");
        System.out.println("4. Exit");

        System.out.println("Enter your Choice:");
        int ch;
        try{
            ch = sc.nextInt();
        }catch(Exception e){
            System.out.println("Enter a Valid Choice or Input");
            return true;
        }

        switch (ch) {
            case 1 -> this.addEmployee();
            case 2 -> this.displayAll();
            case 3 -> this.searchEmployee();
            case 4 -> System.exit(0);
            default -> System.out.println("Enter a Valid Choice");
        }
        return true;
    }

    public static void main(String[] args) {
        Microsoft ms = new Microsoft();

        while(ms.menu()){}

        System.out.println("Exiting....");
    }
}
