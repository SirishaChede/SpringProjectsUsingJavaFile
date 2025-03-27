package constructorInjectionExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	AnnotationConfigApplicationContext con= new AnnotationConfigApplicationContext(Beans.class);
	Order ord=con.getBean(Order.class);
	ord.display();

	}

}
