package inheritance.assistedproblems.transportsystem;

public class Bike extends Vehicle{
    private boolean isSports;
    Bike(int maxSpeed,String fuelType,boolean isSports)
    {
        super(maxSpeed, fuelType);
        this.isSports=isSports;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Is Sports Bike: "+isSports);
    }
}
