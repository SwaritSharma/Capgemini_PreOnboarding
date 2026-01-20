package inheritance.assistedproblems.employeesystem;

public class Employee {
    protected    String name;
    protected final int id;
    protected int salary;

    public Employee(String name,int id,int salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void displayDetails()
    {
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Salary: "+salary);
    }
}
