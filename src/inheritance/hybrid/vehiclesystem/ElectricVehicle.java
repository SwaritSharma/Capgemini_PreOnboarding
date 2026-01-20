package inheritance.hybrid.vehiclesystem;

public class ElectricVehicle extends Vehicle{
    ElectricVehicle(int maxSpeed,String model)
    {
        super(maxSpeed, model);
    }

    public void charge()
    {
        System.out.println("Vehicle is Charging");
    }

}
