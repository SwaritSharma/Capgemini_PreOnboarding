package inheritance.hybrid.vehiclesystem;

public class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(int maxSpeed,String model)
    {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the vehicle");
    }
}
