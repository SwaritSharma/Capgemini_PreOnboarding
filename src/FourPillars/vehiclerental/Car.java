package FourPillars.vehiclerental;

public class Car extends Vehicle implements Insurable{
    private String policyNumber;
    Car(String vehicleNumber,String type,int rentalRate,String policyNumber)
    {
        super(vehicleNumber, type, rentalRate);
        this.policyNumber=policyNumber;
    }

    @Override
    public double calculateInsurance() {
        return 0;
    }
    @Override
    public double calculateRentalCost(int days)
    {
        return getRentalRate()*days;
    }
    @Override
    public void getInsuranceDetails() {
        System.out.println("Car insurance applied");
    }
}
