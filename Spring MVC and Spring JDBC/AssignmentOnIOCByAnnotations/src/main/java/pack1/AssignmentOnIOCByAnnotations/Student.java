package pack1.AssignmentOnIOCByAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("student")
public class Student {
	
	private int id;
	private String name;
	private Chair chair;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Chair getChair() {
		return chair;
	}
	public void setChair(Chair chair) {
		this.chair = chair;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", chair=" + chair + "]";
	}
	@Autowired
	public Student(Chair chair) {
		super();
		this.chair = chair;
	}
	
	
}
