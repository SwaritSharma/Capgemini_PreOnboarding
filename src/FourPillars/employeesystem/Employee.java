package FourPillars.employeesystem;

public abstract class Employee {
    private int employeeId;
    private String name;
    protected double baseSalary;

    public Employee(int employeeId,String name,double baseSalary)
    {
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails()
    {
        System.out.println("Employee Id"+employeeId);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+baseSalary);
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
