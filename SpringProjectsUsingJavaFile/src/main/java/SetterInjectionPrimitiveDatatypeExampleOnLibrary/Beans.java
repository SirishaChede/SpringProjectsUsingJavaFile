package SetterInjectionPrimitiveDatatypeExampleOnLibrary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
	
	@Bean
	public Book book() {
		Book book =new Book();
		book.setAuthor("fvff");
		book.setBookcost(100);
		book.setBookname("hbff");
		book.setPublishedyear(2024);
		return book;
		
		
		
	}
	@Bean
	public Book book2() {
		Book book =new Book();
		book.setAuthor("fvff");
		book.setBookcost(100);
		book.setBookname("hbff");
		book.setPublishedyear(2024);
		return book;
	}
	@Bean
	public Library library() {
		Library library=new Library() ;
		library.setLibraryname("asddf");
		library.setBook(book());
		return library;
		}
		
		
	}
	


