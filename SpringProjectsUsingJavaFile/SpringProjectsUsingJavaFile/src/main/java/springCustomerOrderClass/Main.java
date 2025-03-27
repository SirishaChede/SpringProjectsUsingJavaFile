package springCustomerOrderClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Load the Spring configuration from the AppConfig class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve beans from the Spring context
        Customer customer = context.getBean(Customer.class);
        Order order = context.getBean(Order.class);

        // Set the order for the customer
        customer.setOrder(order);
        
        customer.display();//in the method the data will be present in the 
        //customer class so we can call this method in the main class
        order.displayinfo();

        // Print customer and order info
        /*System.out.println("Customer Info: ");
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());

        System.out.println("\nOrder Info: ");
        System.out.println("Order ID: " + order.getId());
        System.out.println("Order Date: " + order.getOrderDate());

        context.close();*/  // Close the application context
    }
}