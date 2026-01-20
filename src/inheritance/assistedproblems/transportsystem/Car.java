package inheritance.assistedproblems.transportsystem;
public class Car extends Vehicle{
    private int seatCapacity;
    public Car(int maxSpeed,String fuelType,int seatCapacity)
    {
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seat Capacity: "+seatCapacity);
    }
}

