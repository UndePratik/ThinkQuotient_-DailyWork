package com.dequeue;

public class Book {
	
	int bookId;
	String bookName;
	int bookPrice;
	
	
	public Book() {
		super();
		
	}


	public Book(int bookId, String bookName, int bookPrice)
	{
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	

}
