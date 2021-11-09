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

import com.thbs.model.Product;
import com.thbs.repo.Productrepo;

@RestController
@RequestMapping("/Products")
public class ProductController {
	@Autowired
	Productrepo pr;
	@PostMapping("/Product")
	public ResponseEntity<Product>Save(@RequestBody Product p)
	{
		Product p1=pr.save(p);
		return new  ResponseEntity<Product>(p1,HttpStatus.OK);
	}
	
	@GetMapping("/getAllProducts")
	public ResponseEntity<List<Product>>getAllProducts()
	{
		List<Product> p2=pr.findAll();
		return new ResponseEntity<List<Product>>(p2,HttpStatus.OK);
	}
	@GetMapping("/getaProduct/{id}")
	public ResponseEntity<Product>getAProductById(@PathVariable int id)
	{
		Optional<Product> p=pr.findById(id);
		if(p!=null)
		{
			Product pk=p.get();
			return new ResponseEntity<Product>(pk,HttpStatus.OK);
		}
		return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/DeleteAProduct/{id}")
	public ResponseEntity<Product>DeleteProductById(@PathVariable int id)
	{
		pr.deleteById(id);
		if(pr.existsById(id))
			return new ResponseEntity<Product>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
	}
}
