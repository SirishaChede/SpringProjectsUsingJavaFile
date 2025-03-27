package springCustomerOrderClass;

import java.util.Date;

public class Order {
	private int id;
    private Date orderDate;

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for orderDate
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public void displayinfo() {
    	 System.out.println("\nOrder Info: ");
         System.out.println("Order ID: " + id);
         System.out.println("Order Date: " + orderDate);
    }
}
