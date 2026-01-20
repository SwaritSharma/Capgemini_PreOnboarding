package inheritance.assistedproblems.transportsystem;

public class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed,String fuelType)
    {
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    public void displayDetails()
    {
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Vehicle Type: "+fuelType);
    }
}
