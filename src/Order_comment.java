//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Order_comment {
//    Scanner input=new Scanner(System.in);
//    static int orderId;
//    private LocalDate orderDate;
//    private double totalPrice;
//    private String orderLocation;
//    private String orderState;
//    private Map<Food, Integer> items;
//    customer customerData=new customer();
//    // Method to return current date
//    public static LocalDate getCurrentDate() {
//        return LocalDate.now(); // Returns the current date in ISO-8601 format (e.g., 2024-12-09)
//    }
//    public Order(){
//        orderId++;
//        this.orderDate = getCurrentDate();
//        this.orderLocation = customerData.address;
//        this.orderState = "Pending"; //delivery
//        this.items = new LinkedHashMap<>();
//        this.totalPrice = 0;
//        orderId++;
//    }
////    public Order(int orderId, String orderDate) {
////        this.orderId = orderId;
////        this.orderDate = orderDate;
////        this.orderLocation = customerData.address;
////        this.orderState = "Pending"; //
////        this.items = new LinkedHashMap<>();
////        this.totalPrice = 0;
////        orderId++;
////    }
//
//    public void addItem(Food food, int quantity) {
//        items.put(food, items.getOrDefault(food, 0) + quantity);
//        totalPrice += food.getPrice() * quantity;
//    }
//    public void create_order(){
//
//        System.out.println("===================================");
//        boolean ordering = true;
//        while (ordering) {
//            System.out.print("Enter the number of the menu item to add (or 0 to finish): ");
//            int itemChoice = input.nextInt();
//
//
//            if (itemChoice == 0) {
//                ordering = false;
//            } else if (itemChoice > 0 && itemChoice <= selectedRestaurant.menu.size()) {
//                System.out.print("Enter the quantity: ");
//                int quantity = input.nextInt();
//
//                if (quantity > 0) {
//                    Food selectedFood = selectedRestaurant.menu.get(itemChoice - 1);
//                    addItem(selectedFood, quantity);
//                    System.out.println(quantity + " x " + selectedFood.name + " added to your order.");
//                } else {
//                    System.out.println("Invalid quantity! Please enter a positive number.");
//                }
//            } else {
//                System.out.println("Invalid item choice! Please select a valid menu item.");
//            }
//        }
//    }
//    public void view_Order(){
//        System.out.println("===================================");
//        System.out.println("Order Summary");
//        System.out.println(toString());
//    }
//
//    public double getTotalPrice() {
//        return totalPrice;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder orderDetails = new StringBuilder();
//        orderDetails.append("Order ID: ").append(orderId)
//                .append("\nDate: ").append(orderDate)
//                .append("\nLocation: ").append(orderLocation)
//                .append("\nState: ").append(orderState)
//                .append("\nTotal Price: ").append(totalPrice).append(" EGP")
//                .append("\nItems:\n");
//
//        for (Map.Entry<Food, Integer> entry : items.entrySet()) {
//            Food food = entry.getKey();
//            int quantity = entry.getValue();
//            orderDetails.append("- ").append(food.name)
//                    .append(" (").append(food.type).append(") - ")
//                    .append(food.price).append(" EGP x")
//                    .append(quantity).append("\n");
//        }
//
//        return orderDetails.toString();
//    }
//}
