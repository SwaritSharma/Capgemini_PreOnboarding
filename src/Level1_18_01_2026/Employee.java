package Level1_18_01_2026;
class Employee {
    static String companyName = "Tech Corp";
    static int totalEmployees = 0;

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    String name;
    final String id;
    String designation;

    Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    void displayEmployeeDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee emp = (Employee) obj;
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + emp.name);
            System.out.println("ID: " + emp.id);
            System.out.println("Designation: " + emp.designation);
        } else {
            System.out.println("Object is not an Employee instance.");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", "E101", "Developer");
        Employee emp2 = new Employee("Bob", "E102", "Manager");

        emp1.displayEmployeeDetails(emp1);
        emp2.displayEmployeeDetails(emp2);
        Employee.displayTotalEmployees();
    }
}
