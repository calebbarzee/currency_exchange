import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //    executes the initialization of employee class and stores objects in list
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeInput(employeeList);
        employeeOutput(employeeList);
    }
    public static void employeeInput(ArrayList<Employee> employeeList) {
        Scanner inputObj = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            // name input
            System.out.println("Enter Employee Name, Age, Salary: ");
            String name = inputObj.next();
            // age input
            int age = inputObj.nextInt();
            // salary input
            double salary = inputObj.nextDouble();

            employeeList.add(new Employee(name, age, salary));
        }
    }
    public static void employeeOutput(ArrayList<Employee> employeeList) {
        // Output input by user
        for (Employee empObj : employeeList) {
            System.out.println(empObj.toString());
        }
    }
}
