import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList employeeList = new ArrayList();
    //    executes the initialization of employee class and stores objects in list
    public static void main(String[] args) {
            Main mainObj = new Main();
            employeeInput(mainObj);
    }
    public static void employeeInput(mainObj) {
        Scanner inputObj = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            // name input
            System.out.println("Enter Employee Name:");
            String name = inputObj.nextLine();

            // age input
            System.out.println("Enter Employee Age:");
            int age = inputObj.nextInt();

            // salary input
            System.out.println("Enter Employee Salary:");
            double salary = inputObj.nextDouble();
        }
    }
    public static void employeeOutput(employeeList) {
        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
