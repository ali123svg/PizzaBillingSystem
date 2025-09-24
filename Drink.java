package advancepizzabillingsystem;

// Drink Class
public class Drink {
    private String name;
    private String size;
    private double price;

    public Drink(String name, String size) {
        this.name = name;
        this.size = size;

        // Base price based on drink size
        switch (size.toLowerCase()) {
            case "small": price = 40; break;
            case "medium": price = 60; break;
            case "large": price = 80; break;
            default: price = 50;
        }
    }

    public double getPrice() {
        return price;
    }

    public String getDetails() {
        return name + " (" + size + ") - Rs." + price;
    }
}