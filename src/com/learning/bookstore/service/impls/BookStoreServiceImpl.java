package com.learning.bookstore.service.impls;

import com.learning.bookstore.database.Database;
import com.learning.bookstore.entities.Author;
import com.learning.bookstore.entities.Book;
import com.learning.bookstore.service.BookStoreService;

public class BookStoreServiceImpl implements BookStoreService{
	
	private Database database = new Database();

	@Override
	public String addAuthor(Author author) {
		
		return null;
	}

	@Override
	public String addBook(Book book) {
		String message = "";
		database.getBookList().add(book);
		message = book.getTitle()+ " has been saved.";
		return message;
	}

	@Override
	public Book searchBookByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book updateBookPrice(String title, double newPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buyBook(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
