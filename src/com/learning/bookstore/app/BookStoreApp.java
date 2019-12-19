package com.learning.bookstore.app;

import java.util.List;

import com.learning.bookstore.entities.Author;
import com.learning.bookstore.entities.Book;
import com.learning.bookstore.service.impls.BookStoreServiceImpl;
import com.learning.bookstore.utilities.Creation;
import com.learning.bookstore.utilities.ScannerUtil;

public class BookStoreApp {
	private static ScannerUtil scanUtil = new ScannerUtil();
	private static Creation creation = new Creation();
	private static BookStoreServiceImpl serviceImpl = new BookStoreServiceImpl();

	public static void main(String[] args) {

		System.out.println("Welcome to Mini-Bookstore");
		boolean flag = true;
		do {
			String message = "Enter a number: \n 1. to add an author"
					+ "\n 2. to add a book \n 3. get total books \n 4. to get total authors";
			
			int number = scanUtil.getInt(message);
			switch(number){
			case 1:
				Author author = creation.createAuthor();
				String choice = scanUtil.getString("Do you want to add books for the author? Type y/n.");
				if(choice.equalsIgnoreCase("y")) {
					Book book = creation.createBook();
					List<Book> bookList = author.getBooks();
					bookList.add(book);
					author.setBooks(bookList);			
				}
				System.out.println(author);
				System.out.println(serviceImpl.addAuthor(author));
				break;
			case 2:
				break;
			case 3: System.out.println(serviceImpl.getTotalBooks());
				break;
			case 4: System.out.println(serviceImpl.getTotalAuthors());
				break;
			default: flag = false;
			}
			
			
		}while(flag);
	}

}
