import java.util.ArrayList;

public class DeliveryStaff {
    private String firstName;
    private String lastName;
    private String location; // The place where the delivery person works
    private double averageReview; // Average review score
    private ArrayList<Order> assignedOrders; // List of orders assigned to the delivery staff we must to update it

    // Constructor
    public DeliveryStaff(String firstName, String lastName, String location, double averageReview) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.averageReview = averageReview;
        this.assignedOrders = new ArrayList<>();
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getAverageReview() {
        return averageReview;
    }

    public void setAverageReview(double averageReview) {
        if (averageReview < 0 || averageReview > 5) {
            throw new IllegalArgumentException("Review score must be between 0 and 5.");
        }
        this.averageReview = averageReview;
    }

    public ArrayList<Order> getAssignedOrders() {
        return new ArrayList<>(assignedOrders); // Return a copy to avoid external modification
    }

    public void setAssignedOrders(ArrayList<Order> assignedOrders) {
        this.assignedOrders = new ArrayList<>(assignedOrders); // Create a copy to maintain encapsulation
    }

    
    
    public void assignOrdersByLocation(ArrayList<Order> orders) {
        for (Order order : orders) {
            if (order.getOrderLocation().equalsIgnoreCase(this.location)) {
                this.assignedOrders.add(order);
            }
        }
    }

   
    public void viewAssignedOrders() {
        System.out.println("Assigned Orders for " + firstName + " " + lastName + ":");
        if (assignedOrders.isEmpty()) {
            System.out.println("No orders assigned.");
        } else {
            for (Order order : assignedOrders) {
                System.out.println(order);
                System.out.println("--------------------");
            }
        }
    }

    @Override
    public String toString() {
        return "DeliveryStaff{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", location='" + location + '\'' +
                ", averageReview=" + averageReview +
                '}';
    }
}
