import java.util.ArrayList;
import java.util.Scanner;

public class Employees {
    int eno;
    String ename;
    double esal;

    private static final Scanner sc = new Scanner(System.in);

    Employees(){
        read();
    }

    void read(){
        System.out.println("Enter the Employee Details");
        System.out.print("Enter the Employee ID: ");
        try{
            this.eno = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the Employee Name: ");
            this.ename = sc.nextLine();
            System.out.print("Enter the Employee Salary: ");
            this.esal = sc.nextDouble();
        }catch(Exception e){
            System.out.println("Enter a Valid Input!!");
        }

    }

    void display(){
        System.out.println("----------------------------------------");
        System.out.println("ID: "+this.eno);
        System.out.println("Name: "+this.ename);
        System.out.println("Salary: "+this.esal);
        System.out.println("--------------------------------------");
    }

    static void displayAll(ArrayList<Employees> emps){
        // Display all Employees
        for(Employees e:emps){
            e.display();
        }
    }

    static void search(ArrayList<Employees> emps){
        // Search for an Employee
        System.out.println("Enter the Employee Id to search: ");
        int eid = sc.nextInt();
        boolean isFound = false;
        for(Employees e:emps){
            if(e.eno == eid){
                isFound = true;
                e.display();
                break;
            }
        }
        if(!isFound){
            System.out.println("Employee with the ID "+eid+" doesn't exists!");
        }
    }
}
