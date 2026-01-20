package inheritance.multilevel.onlineretail;

public class Order {
    protected int orderId;
    protected int orderDate;

    Order(int orderId,int orderDate)
    {
        this.orderId=orderId;
        this.orderDate=orderDate;
    }

    public void getOrderStatus()
    {
        System.out.println("Order ID: "+orderId);
        System.out.println("Order Date: "+orderDate);
    }

}
