package com.learning.bookstore.service;

import java.util.List;

import com.learning.bookstore.entities.Author;
import com.learning.bookstore.entities.Book;

public interface BookStoreService {

	String addAuthor(Author author);
	String addBook(Book book); // author must be added, either new or old
	String buyBook(String title);
	Book searchBookByTitle(String title);
	Book updateBookPrice(String title, double newPrice);
	int getTotalAuthors();
	int getTotalBooks();
	List<Book> findAllBooksByAuthor(String authorName);
	List<Author> findAllAuthorsByBook(String bookTitle);
	
}
