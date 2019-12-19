package com.learning.bookstore.entities;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private int id = 100000;
	private String title;
	private double price;
	private int number;
	private List<Author> authors = new ArrayList<Author>();
	
	public int getId() {
		return id;
	}
	public void setId() {
		++this.id;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String title, double price, int number, List<Author> authors) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.number = number;
		this.authors = authors;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + ", number=" + number + ", authors="
				+ authors + "]";
	}
	
	

	
	
	

}
