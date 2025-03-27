package springCustomerOrderClass;

public class Customer {
	
	


	    private int id;
	    private String name;
	    private String email;
	    private Order order;  // A customer has one order

	    // Getter and Setter for id
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    // Getter and Setter for name
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter and Setter for email
	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    // Getter and Setter for order
	    public Order getOrder() {
	        return order;
	    }

	    public void setOrder(Order order) {
	        this.order = order;
	    }
	    
	    public void display() {
	    	System.out.println("Customer Info: ");
	        System.out.println("Name: " + name);
	        System.out.println("Email: " + email);
	    }
	}
