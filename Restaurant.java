package Management;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Restaurant {
    private BlockingQueue<Order> orderQueue;

    public Restaurant() {
        orderQueue = new PriorityBlockingQueue<>();
    }

    public void placeOrder(Order order) {
        try {
            orderQueue.put(order);
            System.out.println(" Order Placed: " + order);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Order processOrder() {
        try {
            Order order = orderQueue.take();
            System.out.println(" Cooking Order: " + order);
            Thread.sleep(2000);
            System.out.println(" Order Ready: " + order);
            return order;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
