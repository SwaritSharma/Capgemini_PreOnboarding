package inheritance.multilevel.onlineretail;

public class ShippedOrder extends Order{
    private int trackingNumber;
    public  ShippedOrder(int orderId,int orderDate,int trackingNumber)
    {
        super(orderId, orderDate);
        this.trackingNumber=trackingNumber;
    }

    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Order Tracking Number: "+trackingNumber);
    }
}
