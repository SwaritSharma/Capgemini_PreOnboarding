package inheritance.assistedproblems.employeesystem;

public class Manager extends Employee{
        private int teamSize;
        public Manager(String name,int id,int salary,int teamSize)
        {
            super(name, id, salary);
            this.teamSize=teamSize;
        }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team size: "+teamSize);
    }
}
