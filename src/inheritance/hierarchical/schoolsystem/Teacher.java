package inheritance.hierarchical.schoolsystem;

public class Teacher extends Person{
    private String subject;
    Teacher(String name,int age,String subject)
    {
        super(name, age);
        this.subject=subject;
    }

    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Role: Teacher");
    }
}
