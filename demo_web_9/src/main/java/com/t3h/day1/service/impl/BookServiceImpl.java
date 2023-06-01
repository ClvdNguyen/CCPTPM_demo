package com.t3h.day1.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.t3h.day1.model.Student;
import com.t3h.day1.model.book.Book;
import com.t3h.day1.model.book.BookRequest;
import com.t3h.day1.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	private static List<Book> books = new ArrayList<Book>();

	static {
		books.add(new Book(1, "Conan Ep 1", "tham tu lung danh conan 1", "author", 10000, "comic"));
	}
	
	@Override
	public Book getBook(Integer id) {
		return books.stream().filter(book -> book.getId() == id).findFirst().get();
	}

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return books;
	}

	@Override
	public Book createBook(BookRequest req) {
		Book book = new Book();
		book.setAuthor(req.getAuthor());
		book.setDesc(req.getDesc());
		book.setName(req.getName());
		book.setPrice(req.getPrice());
		book.setType(req.getType());
		
		book.setId(books.size() + 1);
		books.add(book);
		return book;
	}

	@Override
	public Book editBook(BookRequest req, Integer bookId) {
		try {
			Book book = books.get(bookId - 1);
			book.setAuthor(req.getAuthor());
			book.setDesc(req.getDesc());
			book.setName(req.getName());
			book.setPrice(req.getPrice());
			book.setType(req.getType());
			return book;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Boolean deleteBook(Integer bookId) {
		try {
			books.remove(bookId -1);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

}
