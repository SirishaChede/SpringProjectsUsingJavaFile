package SetterInjectionPrimitiveDatatypeExampleOnLibrary;

public class Book {
	
	private String bookname;
	private String Author;
	private int bookcost;
	private int publishedyear;
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getBookcost() {
		return bookcost;
	}
	public void setBookcost(int bookcost) {
		this.bookcost = bookcost;
	}
	public int getPublishedyear() {
		return publishedyear;
	}
	public void setPublishedyear(int publishedyear) {
		this.publishedyear = publishedyear;
	}
	
	public void display() {
		System.out.println("name:"+bookname);
		System.out.println("author:"+Author);
		System.out.println("cost:"+bookcost);
		System.out.println("cost:"+publishedyear);
	}

}
