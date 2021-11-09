package com.thbs.repo;

import java.util.ArrayList;
import java.util.List;

import com.thbs.model.Student;

public class StudentRepo {
	List<Student> slist;
	public StudentRepo()
	{
		slist=new ArrayList();
		Student s1=new Student();
		s1.setId(100);
		s1.setName("varun");
		s1.setAge(22);
		
		Student s2=new Student();
		s2.setId(200);
		s2.setName("basavaraj");
		s2.setAge(24);
		
		slist.add(s1);
		slist.add(s2);
	}
	
	public List<Student> getAllStudents()
	{
		return slist;
	}
	
	public Student getAStudent(int id)
	{
		for(Student s:slist)
		{
			if(s.getId()==id)
				return s;
		}
		return null;
	}
}
