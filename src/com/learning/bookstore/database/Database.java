package com.learning.bookstore.database;

import java.util.ArrayList;
import java.util.List;

import com.learning.bookstore.entities.Book;

public class Database {
	
	private List<Book> bookList = new ArrayList<Book>();

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	

}
