package com.t3h.day1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.t3h.day1.model.book.Book;
import com.t3h.day1.model.book.BookRequest;
import com.t3h.day1.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;

	/// book/id
	@GetMapping("/{id}")
	public Book getBook(@PathVariable("id") Integer id) {
		
		return bookService.getBook(id-1);
	}

	// /book/list
	@GetMapping("/list")
	public List<Book> getBooks() {
		return bookService.getBooks();
	}

	@PostMapping("")
	public Book createBook(@RequestBody BookRequest req) {
		return bookService.createBook(req);
	}

	@PutMapping("/{id}")
	public Book editBook(@PathVariable("id") Integer id, @RequestBody BookRequest req) {
		return bookService.editBook(req, id);
	}

	@DeleteMapping("/{id}")
	public String deleteBook(@PathVariable("id") Integer id) {
		if(bookService.deleteBook(id))
			return "OK";
		
		return "FAILED";
	}
}
