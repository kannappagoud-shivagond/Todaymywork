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

import com.thbs.model.Train;
import com.thbs.repo.TrainRepository;

@RestController
@RequestMapping("/Trains")
public class TrainController {
	@Autowired
	TrainRepository jp;
	@PostMapping("/Train")
	public ResponseEntity<Train>Save(@RequestBody Train t)
	{
		Train t1=jp.save(t);
		return new ResponseEntity<Train>(t1,HttpStatus.OK);
	}
	@GetMapping("/getAllTrains")
	public ResponseEntity<List<Train>>getAllProducts()
	{
		List<Train> p2=jp.findAll();
		return new ResponseEntity<List<Train>>(p2,HttpStatus.OK);
	}
	@GetMapping("/getATrain/{id}")
	public ResponseEntity<Train>getAProductById(@PathVariable int id)
	{
		Optional<Train> p=jp.findById(id);
		if(p!=null)
		{
			Train pk=p.get();
			return new ResponseEntity<Train>(pk,HttpStatus.OK);
		}
		return new ResponseEntity<Train>(HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/DeleteATrain/{id}")
	public ResponseEntity<Train>DeleteProductById(@PathVariable int id)
	{
		jp.deleteById(id);
		if(jp.existsById(id))
			return new ResponseEntity<Train>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<Train>(HttpStatus.NOT_FOUND);
	}
	
}
