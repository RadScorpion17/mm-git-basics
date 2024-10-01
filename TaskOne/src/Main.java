import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        employeeService(scan);
    }

    //Task One
    public static void employeeService(Scanner scan){
        int idNumberFloor = 27560000;
        int idNumberCeiling = 27569999;

        System.out.println("Enter employee name: ");
        String name = scan.next();

        System.out.println("Enter employee last name: ");
        String lastName = scan.next();

        System.out.println("Enter age (between 0 - 100): ");
        int age = scan.nextInt();
        while(age < 0 || age > 100){
            System.out.println("Please provide a valid number between 0 and 100");
            age = scan.nextInt();
        }

        System.out.println("Enter employee id number ("+ idNumberFloor +" - "+idNumberCeiling+") :");
        int employeeId = scan.nextInt();
        while(employeeId < idNumberFloor || employeeId > idNumberCeiling){
            System.out.println("Please provide a valid number between " + idNumberFloor + " and " + idNumberCeiling);
            employeeId = scan.nextInt();
        }

        Employee employee = new Employee(name,lastName,age,employeeId);

        System.out.println("Full Name: " + employee.Name + " " + employee.LastName +
                           "\nAge: " + employee.Age +
                           "\nEmployee N°: " + employee.EmployeeID +
                           "\nEmail: " + employee.Email);
    }
}