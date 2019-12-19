package com.learning.bookstore.service.impls;

import java.util.List;

import com.learning.bookstore.database.Database;
import com.learning.bookstore.entities.Author;
import com.learning.bookstore.entities.Book;
import com.learning.bookstore.service.BookStoreService;

public class BookStoreServiceImpl implements BookStoreService{
	
	private Database database = new Database();

	@Override
	public String addAuthor(Author author) {
		database.getAuthorList().add(author);
		database.setTotalAuthors();
		return author.getName() + " has been added to the list of authors";
				
	}

	@Override
	public String addBook(Book book) {
		database.getBookList().add(book);
		database.setTotalBooks(book.getNumber());
		return book.getTitle() + " has been added to the inventory.";
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

	@Override
	public int getTotalAuthors() {
		
		return database.getTotalAuthors();
	}

	@Override
	public int getTotalBooks() {
		
		return database.getTotalBooks();
	}

	@Override
	public List<Book> findAllBooksByAuthor(String authorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Author> findAllAuthorsByBook(String bookTitle) {
		// TODO Auto-generated method stub
		return null;
	}

}
