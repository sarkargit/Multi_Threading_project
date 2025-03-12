package Management;



public class Cook extends Thread {
    private Restaurant restaurant;

    public Cook (Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        while (true) {
            restaurant.processOrder();
        }
    }
}
