package SetterInjectionCollectionTypeExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(Beans.class);
		Department d=con.getBean(Department.class);
		//Employee e=con.getBean(Employee.class);
		
		d.Display();
	}

}
