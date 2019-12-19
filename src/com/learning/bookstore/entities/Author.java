package com.learning.bookstore.entities;

import java.util.ArrayList;
import java.util.List;

public class Author {

	private int id = 0;
	private String name;
	private List<Book> books = new ArrayList<Book>();
	
	public Author(int id, String name, List<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.books = books;
	}
	public Author() {
		super();
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", books=" + books + "]";
	}
	public int getId() {
		return id;
	}
	public void setId() {
		++this.id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
}
