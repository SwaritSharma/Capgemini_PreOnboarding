package FourPillars.employeesystem;

public class FullTimeEmployee extends Employee implements Department{
    private String department;
    FullTimeEmployee(int employeeId,String name,double baseSalary)
    {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
