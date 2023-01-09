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
        System.out.println("Enter the Employee ID");
        this.eno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Employee Name");
        this.ename = sc.nextLine();
        System.out.println("Enter the Employee Salary");
        this.esal = sc.nextDouble();
    }

    void display(){
        System.out.println("Employee Details");
        System.out.println("----------------------------------------");
        System.out.println("ID: "+this.eno);
        System.out.println("Name: "+this.ename);
        System.out.println("Salary: "+this.esal);
    }

    public static void main(String[] args) {
        System.out.println("Enter the total Number of Employees");
        int n = sc.nextInt();
        Employees[] emps= new Employees[n];
        for(int i=0;i<n;i++){
            emps[i] = new Employees();
        }

        // Display all Employees
        for(Employees e:emps){
            e.display();
        }

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
