package inheritance.multilevel.onlineretail;

public class DeliveredOrder extends ShippedOrder {
    private int deliveryDate;
    public DeliveredOrder(int orderId,int orderDate,int trackingNumber,int deliveryDate)
    {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate=deliveryDate;
    }

    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery Date: "+deliveryDate);
    }
}
