package com.t3h.day1.service;

import java.util.List;

import com.t3h.day1.model.book.Book;
import com.t3h.day1.model.book.BookRequest;

public interface BookService {
	
	Book getBook(Integer id);

	List<Book> getBooks();

	Book createBook(BookRequest req);

	Book editBook(BookRequest req, Integer bookId);

	Boolean deleteBook(Integer bookId);
}
