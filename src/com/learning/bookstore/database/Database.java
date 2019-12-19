package com.learning.bookstore.database;

import java.util.ArrayList;
import java.util.List;

import com.learning.bookstore.entities.Author;
import com.learning.bookstore.entities.Book;

public class Database {
	
	private List<Book> bookList = new ArrayList<Book>();
	private List<Author> authorList = new ArrayList<Author>();
	
	private int totalBooks = 0;
	private int totalAuthors = 0;
	
	

	public int getTotalAuthors() {
		return totalAuthors;
	}

	public void setTotalAuthors() {
		++this.totalAuthors;
	}

	public int getTotalBooks() {
		return totalBooks;
	}

	public void setTotalBooks(int total) {
		this.totalBooks += total; //this.totalBooks = this.totalBooks + total;
	}

	public List<Author> getAuthorList() {
		return authorList;
	}

	public void setAuthorList(List<Author> authorList) {
		this.authorList = authorList;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	

}
