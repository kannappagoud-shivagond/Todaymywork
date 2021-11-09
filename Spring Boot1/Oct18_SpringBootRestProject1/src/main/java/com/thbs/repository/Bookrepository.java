package com.thbs.repository;
import java.util.ArrayList;
import java.util.List;

import com.thbs.model.Book;
public class Bookrepository {
	List<Book> blist;
	
	public Bookrepository()
	{
		blist=new ArrayList<Book>();
		Book b1=new Book();
		b1.setBookId(1);
		b1.setBookName("c");
		b1.setBookPrice(100);
		
		Book b2=new Book();
		b2.setBookId(2);
		b2.setBookName("c++");
	    b2.setBookPrice(200);
	    
	    blist.add(b1);
	    blist.add(b2);
	    
	}
	public List<Book> getAllBooks()
	{
		return blist;
	}

	public Book getABook(int book_id)
	{
		for(Book b:blist)
		{
			if(b.getBookId()==book_id)
			{
				return b;
			}
		}
		return null;
		}
	}
