package com.thbs.repo;

import java.util.ArrayList;
import java.util.List;

import com.thbs.model.Person;

public class PersonRepo {
	
	List<Person> plist;
	
	public PersonRepo()
	{
		plist=new ArrayList<Person>();
		Person p=new Person();
		p.setId(10);
		p.setNmae("Darshan");
		p.setAge(22);
		
		Person p1=new Person();
		p1.setId(20);
		p1.setNmae("Sagar");
		p.setAge(23);
		
		plist.add(p);
		plist.add(p1);
	}
	
	public List<Person> getAllPersons()

	{
		return plist;
	}
	
	public Person getAPerson(int id)
	{
		for(Person p:plist)
		{
			if(p.getId()==id)
				return p;
		}
		return null;
	}
}
