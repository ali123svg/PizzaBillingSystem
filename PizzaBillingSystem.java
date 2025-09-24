package advancepizzabillingsystem;

import java.util.Scanner;

// Main Class
public class PizzaBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        boolean running = true;
        while (running) {
            System.out.println("\n=== PIZZA BILLING SYSTEM ===");
            System.out.println("1. Veg Pizza");
            System.out.println("2. Non-Veg Pizza");
            System.out.println("3. Deluxe Pizza");
            System.out.println("4. Cold Drink");
            System.out.println("5. Apply Coupon");
            System.out.println("6. Generate Bill & Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Enter Size (Small/Medium/Large): ");
                    String size = sc.nextLine();

                    Pizza pizza = null;
                    if (choice == 1) pizza = new VegPizza(size);
                    else if (choice == 2) pizza = new NonVegPizza(size);
                    else if (choice == 3) pizza = new DeluxePizza(size);

                    // Extra toppings
                    System.out.print("Add Paneer topping? (yes/no): ");
                    if (sc.nextLine().equalsIgnoreCase("yes"))
                        pizza.addTopping("Paneer", 60);

                    System.out.print("Add Mushroom topping? (yes/no): ");
                    if (sc.nextLine().equalsIgnoreCase("yes"))
                        pizza.addTopping("Mushroom", 70);

                    order.addItem(pizza.getDetails(), pizza.getPrice());
                    System.out.println(" Pizza successfully Added!");
                    break;

                case 4:
                    System.out.print("Enter Drink Name (FizzJeera/PulpiOrange/Frooti): ");
                    String dName = sc.nextLine();
                    System.out.print("Enter Size (Small/Medium/Large): ");
                    String dSize = sc.nextLine();
                    Drink drink = new Drink(dName, dSize);
                    order.addItem(drink.getDetails(), drink.getPrice());
                    System.out.println(" Drink successfully Added!");
                    break;

                case 5:
                    System.out.print("Enter Coupon Code: ");
                    String coupon = sc.nextLine();
                    order.applyCoupon(coupon);
                    break;

                case 6:
                    order.printBill();
                    running = false;
                    break;

                default:
                    System.out.println(" Invalid Choice!");
            }
        }
        sc.close();
    }
}