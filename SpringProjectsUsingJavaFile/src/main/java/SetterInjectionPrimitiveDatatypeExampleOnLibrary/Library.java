package SetterInjectionPrimitiveDatatypeExampleOnLibrary;

public class Library {
	
	
	private String Libraryname;
	private Book book;
	public String getLibraryname() {
		return Libraryname;
	}
	public void setLibraryname(String libraryname) {
		Libraryname = libraryname;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public void display() {
		System.out.println("libraryname:"+Libraryname);
        System.out.println("book name:"+book.getBookname());
        System.out.println("book author:"+book.getAuthor());
        System.out.println("bookcost:"+book.getBookcost());
	}

}
