package constructorInjectionExample;

import org.springframework.stereotype.Component;

@Component
public class Custo {
	
	 
		// TODO Auto-generated constructor stub
	
     private String name;
	 private int id;
	 private String contact;
	 private String address;
	 public Custo(String name, int id, String contact, String address) {
			
			this.name = name;
			this.id = id;
			this.contact = contact;
			this.address = address;
}
	 
	 public void displayCustomer() {
		 System.out.println("name:"+name);
		 System.out.println("id"+id);
		 System.out.println("contact"+contact);
		 System.out.println("address:"+address);
	 }
}
