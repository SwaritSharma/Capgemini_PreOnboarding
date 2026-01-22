package objectmodeling.companyanddepartments;

public class Test {
    static void main() {
        Company c1=new Company("CG");
        Department d1=new Department("Tech");
        Department d2=new Department("HR");

        Employee e1=new Employee("John",1,40000);
        Employee e2=new Employee("Sam",2,45000);
        Employee e3=new Employee("Samuel",3,40000);

       d1.addEmployee(e1);
        d2.addEmployee(e2);
        d1.addEmployee(e3);
       c1.addDepartment(d1);
       c1.addDepartment(d2);
       c1.displayCompanyDetails();

       c1.delete();
        System.out.println();
//       e1.displayEmployeeDetails();
        c1.displayCompanyDetails();
    }

}
