package w3;
import java.util.Scanner;

class EMPLOYEE {
    String Ename;
    int Eid;
    double Basic, DA, Gross_Sal, Net_Sal;

    // Method to read employee details
    void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        Eid = sc.nextInt();
        sc.nextLine();   // clear buffer

        System.out.print("Enter Employee Name: ");
        Ename = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        Basic = sc.nextDouble();
        
        sc.close();
    }

    // Method to compute net salary
    void compute_net_sal() {
        DA = 0.52 * Basic;
        Gross_Sal = Basic + DA;
        double IT = 0.30 * Gross_Sal;
        Net_Sal = Gross_Sal - IT;
    }

    // Method to display employee details
    void display() {
        System.out.println("\nEmployee ID: " + Eid);
        System.out.println("Employee Name: " + Ename);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sal);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int N = sc.nextInt();

        EMPLOYEE[] emp = new EMPLOYEE[N];

        // Read and compute details for each employee
        for (int i = 0; i < N; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));
            emp[i] = new EMPLOYEE();
            emp[i].read();
            emp[i].compute_net_sal();
        }

        // Display employee details
        System.out.println("\n----- EMPLOYEE DETAILS -----");
        for (int i = 0; i < N; i++) {
            emp[i].display();
        }
        sc.close();
    }
}
