package SetterInjectionPrimitiveDatatypeExampleOnLibrary;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[]Args) {
                 AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(Beans.class);
                 Book book=(Book)con.getBean("book");
                 book.display();
                 System.out.println("*******second book******");
                 Book book1=(Book)con.getBean("book2");
                 book.display();
                 Library lib=con.getBean(Library.class);
                     
                 
               
                 lib.display();
                 
                 con.close();
}
}

