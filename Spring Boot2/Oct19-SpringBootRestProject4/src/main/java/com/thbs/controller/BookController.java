package com.thbs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thbs.model.Book;
import com.thbs.repository.BookRepository;

@RestController
@RequestMapping("/Books")
public class BookController {
	@Autowired
	BookRepository jp;
	@PostMapping("/Book")
	public ResponseEntity<Book>Save(@RequestBody Book b)
	{
		Book bk=jp.save(b);
		return new ResponseEntity<Book>(bk,HttpStatus.OK);
	}
	
	@GetMapping("/getAllbooks")
	public ResponseEntity<List<Book>>getAllBooks()
	{
		List<Book> blist=jp.findAll();
		return new ResponseEntity<List<Book>>(blist,HttpStatus.OK);
	}
	
	@GetMapping("/getAbook/{id}")
	public ResponseEntity<Book>getABook(@PathVariable int id)
	{
		Optional<Book> bk=jp.findById(id);
		
		if(bk!=null) 
		{
			Book b=bk.get();
			return new ResponseEntity<Book>(b,HttpStatus.OK);
		}
			return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/DeleteAbook/{id}")
	public ResponseEntity<Book>DeleteBookById(@PathVariable int id)
	{
		if(jp.existsById(id))
		{
			jp.deleteById(id);
			return new ResponseEntity<Book>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
	}
}