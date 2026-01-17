package Level1_16_01_2026;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    CarRental(String customerName,String carModel,int rentalDays)
    {
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
    }
    CarRental(CarRental car)
    {
        this.customerName=car.customerName;
        this.carModel=car.carModel;
        this.rentalDays=car.rentalDays;
    }
    public void displayCost()
    {
        int cost=rentalDays*1000;
        System.out.println("Total cost of car is "+cost);
    }
}
