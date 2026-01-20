package inheritance.hierarchical.schoolsystem;

public class Student extends Person {
    private char grade;
    Student(String name,int age,char grade)
    {
        super(name, age);
        this.grade=grade;
    }

    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Role: Student");
    }
}
