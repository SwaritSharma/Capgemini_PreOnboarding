package inheritance.assistedproblems.employeesystem;

public class Developer extends Employee {
    private String programmingLanguage;
    public Developer(String name,int id,int salary,String programmingLanguage)
    {
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: "+programmingLanguage);
    }
}
