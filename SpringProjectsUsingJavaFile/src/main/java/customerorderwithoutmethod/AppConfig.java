package customerorderwithoutmethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Customer cust() {
		Customer cus=new Customer();
		cus.setName("siri");
		cus.setId(1);
		cus.setAddress("hyderabad");
		cus.setContact("3744749");
		return cus;
		
	}
	@Bean
	public Order ord() {
		Order order=new Order();
		order.setOrderDate(new java.util.Date());
		order.setProductid("hbdfhfh");
		order.setProductname("pen");
		order.setCustomer(cust());
		return order;
		
	}	
	}
	
	


