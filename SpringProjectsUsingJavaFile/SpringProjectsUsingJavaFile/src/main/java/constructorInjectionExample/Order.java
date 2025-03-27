package constructorInjectionExample;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component

public class Order {
	@Autowired
	private Beans beans;
	 private String productname;
	 private String productid;
	 private Date orderDate;
	 private Custo customer;
	public Order(String productname, String productid, Date orderDate, Custo customer) {
		
		this.productname = productname;
		this.productid = productid;
		this.orderDate = orderDate;
		this.customer = customer;
	}
	 public void display() {
		 System.out.println("productname:"+productname);
		 System.out.println("productid:"+productid);
		 System.out.println("orderDate:"+new java.util.Date());
		 customer.displayCustomer();
	 }

}
