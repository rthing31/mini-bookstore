package com.learning.bookstore.utilities;

import com.learning.bookstore.entities.Author;
import com.learning.bookstore.entities.Book;

public class Creation {

	ScannerUtil scan = new ScannerUtil();

	public Author createAuthor() {
		Author author = new Author();
		String name = scan.getString("Please enter author's full name.");
		author.setName(name);
		author.setId();
		return author;
	}

	public Book createBook() {
		Book book = new Book();
		String name = scan.getString("Please enter full name of the book.");
		int number = scan.getInt("How many books do you want to add?");
		double price = scan.getDouble("Please enter the unit price.");
		book.setTitle(name);
		book.setNumber(number);
		book.setPrice(price);
		return book;
	}
}
