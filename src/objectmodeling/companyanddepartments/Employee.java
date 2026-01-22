package objectmodeling.companyanddepartments;

public class Employee {
    private String name;
    private int employeeID;
    private int salary;

    public Employee(String name,int employeeID,int salary){
        this.name=name;
        this.employeeID=employeeID;
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }
    public void displayEmployeeDetails()
    {
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Employee Salary: "+salary);
    }
    public void delete()
    {
        System.out.println("Employee Name: "+name+" Deleted");
    }

}
