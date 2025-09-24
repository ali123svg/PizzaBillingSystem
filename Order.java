package advancepizzabillingsystem;

import java.util.ArrayList;
import java.util.List;

// Order Class (Handles Multiple Items)
public class Order {
    private static int counter = 1000; // For unique order ID
    private int orderId;
    private List<String> items = new ArrayList<>();
    private double total = 0;

    public Order() {
        orderId = ++counter;
    }

    public void addItem(String itemDetail, double price) {
        items.add(itemDetail);
        total += price;
    }

    public void applyCoupon(String couponCode) {
        if (couponCode.equalsIgnoreCase("SAVE10")) {
            total -= total * 0.1;
            System.out.println("Coupon Applied: 10% OFF");
        } else {
            System.out.println("Invalid Coupon Code!");
        }
    }

    public void printBill() {
        double gst = total * 0.05; // 5% GST
        double finalAmount = total + gst;

        System.out.println("\n========== PIZZA BILL ==========");
        System.out.println("Order ID: " + orderId);
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("--------------------------------");
        System.out.println("Subtotal: Rs." + total);
        System.out.println("GST (5%): Rs." + gst);
        System.out.println("Total Payable: Rs." + finalAmount);
        System.out.println("================================");
    }
}