package objectmodeling.companyanddepartments;

import java.util.ArrayList;
import java.util.function.DoublePredicate;

public class Company {
    private String companyName;
    ArrayList<Department>departments=new ArrayList<>();;
    public Company(String companyName)
    {
        this.companyName=companyName;
//        departments=
    }

    public void addDepartment(Department department)
    {
        departments.add(department);
    }
    public void removeDepartment(Department department)
    {
        departments.remove(department);
    }
    public void displayCompanyDetails()
    {
        System.out.println("Company Name: "+companyName);
        for(Department d:departments)
        {
            d.displayDepartmentDetails();
        }
    }
    public void delete()
    {
        for(Department d:departments)
        {
            d.delete();
        }
        departments.clear();
    }
}
