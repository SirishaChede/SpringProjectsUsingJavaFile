package customerorderwithoutmethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnotationConfigApplicationContext con= new AnnotationConfigApplicationContext(AppConfig.class);
		Customer customer=con.getBean(Customer.class);
		Order order=con.getBean(Order.class);
		
		
		//prints the all customer details
		System.out.println("print customer details");
		System.out.println("name:"+customer.getName());
		System.out.println("contact:"+customer.getContact());
		System.out.println("id:"+customer.getId());
		System.out.println("address:"+customer.getAddress());
		
		
		//prints all order details
		System.out.println("print order details");
		System.out.println("id:"+order.getProductid());
		System.out.println("productname:"+order.getProductname());
		System.out.println("date:"+order.getOrderDate());
		//print the order detils of the customer variable details
		System.out.println("customer name:"+order.getCustomer().getName());
		System.out.println("customer address:"+order.getCustomer().getAddress());
		
		
		
		

	}

}
