package ContainmentProject2;

import java.util.Arrays;

public class Book {

	private int bookId;
	private String bookName;
	private int publishYear;
	
	
	
	public Book(int bookId, String bookName, int publishYear) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.publishYear = publishYear;
		
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public int getPublishYear() {
		return publishYear;
	}


	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}




	@Override
	public String toString() {
		return "Book bookId:" + bookId + ", bookName: "  + bookName + ", publishYear: " + publishYear;
	}
	
	


	
}
