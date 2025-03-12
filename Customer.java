package Management;

public class Customer extends Thread {
    private Restaurant restaurant;
    private String customerName;
    private int orderId;
    private boolean isVIP;

    public Customer(Restaurant restaurant, String customerName, int orderId, boolean isVIP) {
        this.restaurant = restaurant;
        this.customerName = customerName;
        this.orderId = orderId;
        this.isVIP = isVIP;
    }

    @Override
    public void run() {
        Order order = new Order(customerName, orderId, isVIP);
        restaurant.placeOrder(order);
    }
}
