package Level1_15_01_2026;

class Employee {

    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.name = "Rahul";
        emp.id = 101;
        emp.salary = 45000;

        emp.displayDetails();
    }
}
