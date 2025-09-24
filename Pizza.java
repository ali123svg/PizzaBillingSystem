package advancepizzabillingsystem;

import java.util.ArrayList;
import java.util.List;

// Base Pizza Class
public class Pizza {
    protected String name;
    protected String size;
    protected double price;
    protected List<String> toppings = new ArrayList<>();

    public Pizza(String name, String size) {
        this.name = name;
        this.size = size;

        // Base price based on size
        switch (size.toLowerCase()) {
            case "small": price = 200; break;
            case "medium": price = 300; break;
            case "large": price = 400; break;
            default: price = 250; // default
        }
    }

    public void addTopping(String topping, double cost) {
        toppings.add(topping);
        price += cost;
    }

    public double getPrice() {
        return price;
    }

    public String getDetails() {
        return name + " (" + size + ") - Rs." + price + " " + toppings;
    }
}