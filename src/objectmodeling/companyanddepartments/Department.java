package objectmodeling.companyanddepartments;

import java.util.ArrayList;

public class Department {
    private String departmentName;
    ArrayList<Employee>employees=new ArrayList<>();;

    public Department(String departmentName)
    {
        this.departmentName=departmentName;
//        employees=
    }

    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }
    public void removeEmployee(Employee employee)
    {
        employees.remove(employee);
    }
    public void displayDepartmentDetails()
    {
        System.out.println("Department Name: "+departmentName);
        for(Employee e:employees)
        {
            e.displayEmployeeDetails();
        }
    }
    public void delete()
    {
        for(Employee e:employees)
        {
            e.delete();
        }
        employees.clear();
    }
}
