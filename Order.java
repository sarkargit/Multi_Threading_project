package Management;

class Order implements Comparable<Order> {
    private String customerName;
    private int orderId;
    private boolean isVIP;

    public Order(String customerName, int orderId, boolean isVIP) {
        this.customerName = customerName;
        this.orderId = orderId;
        this.isVIP = isVIP;
    }

    @Override
    public int compareTo(Order other) {
        return Boolean.compare(other.isVIP, this.isVIP);
    }

    @Override
    public String toString() {
        return "Order #" + orderId + " by " + customerName + (isVIP ? " (VIP)" : "");
    }
}
