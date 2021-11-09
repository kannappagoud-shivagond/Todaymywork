package pack1.MyIOCDemo1;

@Component("Student")
public class Student {
	private int studentId;
	private String name;
	private Chair chair;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", chair=" + chair + "]";
	}
	
	@Autowired
	public Student(Chair chair)
	{
	this.chair=chair;	
	}
	

}
