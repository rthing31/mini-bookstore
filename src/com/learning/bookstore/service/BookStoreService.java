package com.learning.bookstore.service;

import com.learning.bookstore.entities.Author;
import com.learning.bookstore.entities.Book;

public interface BookStoreService {

	String addAuthor(Author author);
	String addBook(Book book);
	String buyBook(String title);
	Book searchBookByTitle(String title);
	Book updateBookPrice(String title, double newPrice);
	
}
