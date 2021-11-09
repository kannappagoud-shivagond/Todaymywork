package com.thbs.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thbs.model.Book;
import com.thbs.repository.Bookrepository;

@RestController
@RequestMapping("/Books")
public class BookController {
	@GetMapping("/getAllBooks")
	public ResponseEntity<List<Book>>getAllBooksDetails()
	{
		Bookrepository br=new Bookrepository();
		List<Book> blist=br.getAllBooks();
		return new ResponseEntity<List<Book>>(blist,HttpStatus.OK);
	}
	@GetMapping("/getABook/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable int id)
	{
	Bookrepository br = new Bookrepository();
	Book b = br.getABook(id);
	if(b!=null)
	return new ResponseEntity<Book>(b,HttpStatus.OK);
	else
	return new ResponseEntity<Book>(b,HttpStatus.NOT_FOUND);	
}
}
