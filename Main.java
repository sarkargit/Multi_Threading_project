package Supervisour;
import Management.Cook;
import Management.Customer;
import Management.Restaurant;
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Cook cook1 = new Cook(restaurant);
        cook1.start();
        Customer c1 = new Customer(restaurant, "Ayan", 1, true);
        Customer c2 = new Customer(restaurant, "Amit", 2, false);
        Customer c3 = new Customer(restaurant, "Soniya", 3, true);
        Customer c4 = new Customer(restaurant, "Sayak", 4, false);
        Customer c5 = new Customer(restaurant, "Mainak", 5, true);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();

        try{
            c1.join();
            c2.join();
            c3.join();
            c4.join();
            c5.join();

        }catch(Exception e){
            System.out.println(e);
        }
        
    }

    
}
