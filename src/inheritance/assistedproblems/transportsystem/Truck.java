package inheritance.assistedproblems.transportsystem;

public class Truck extends Vehicle {
    private int loadCapacity;
    public Truck(int maxSpeed,String fuelType,int loadCapacity)
    {
        super(maxSpeed, fuelType);
        this.loadCapacity=loadCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Load Capacity: "+loadCapacity);
    }
}
