public class Employee {
    public String Name;
    public String LastName;
    public int Age;
    public int EmployeeID;
    public String Email;

    public Employee(String name, String lastName, int age, int employeeID) {
        Name = name;
        LastName = lastName;
        Age = age;
        EmployeeID = employeeID;
        Email =  name.toLowerCase() + "." + lastName.toLowerCase() + "@mentormatters.com";
    }
}
