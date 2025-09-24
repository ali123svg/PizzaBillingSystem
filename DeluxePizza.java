package advancepizzabillingsystem;

// Subclass for Deluxe Pizza (comes with default toppings)
public class DeluxePizza extends Pizza {
    public DeluxePizza(String size) {
        super("Deluxe Pizza", size);
        addTopping("Extra Cheese", 50);
        addTopping("Special Toppings", 100);
    }
}