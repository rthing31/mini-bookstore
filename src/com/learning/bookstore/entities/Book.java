package com.learning.bookstore.entities;

import java.util.List;

public class Book {
	private int id;
	private String title;
	private double price;
	private List<Author> authors;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(int id, String title, double price) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
	}
	public Book(int id, String title, double price, List<Author> authors) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.authors = authors;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + ", authors=" + authors;
	}
	
	
	

}
