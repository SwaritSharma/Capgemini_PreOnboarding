package objectmodeling.universityheirarchy;

public class Department {
    private String departmentName;
    Department(String departmentName)
    {
        this.departmentName=departmentName;
    }

    void delete() {
        System.out.println("Department '" + departmentName + "' deleted");
    }
}
