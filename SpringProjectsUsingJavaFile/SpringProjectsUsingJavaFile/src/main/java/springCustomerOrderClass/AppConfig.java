package springCustomerOrderClass;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Defining Customer as a bean
    @Bean
    public Customer customer() {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("John Doe");
        customer.setEmail("john.doe@example.com");
        return customer;
    }

    // Defining Order as a bean
    @Bean
    public Order order() {
        Order order = new Order();
        order.setId(1);
        order.setOrderDate(new java.util.Date());
        return order;
    }
}