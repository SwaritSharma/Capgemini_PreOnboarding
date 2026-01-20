package inheritance.hierarchical.schoolsystem;

public class Staff extends Person {
    private String department;

    Staff(String name,int age,String department)
    {
        super(name, age);
        this.department=department;
    }

    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Role: Staff");
    }
}
