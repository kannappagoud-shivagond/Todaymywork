package pack1.SpringJdbcDemo2;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App
{
public static void main( String[] args )
{
ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");
EmployeeDAO dao = (EmployeeDAO)ctx.getBean("empDAO");
//Employee employee = new Employee();
//employee.setEmployeeId(10);
//employee.setEmployeeName("asdf");
//employee.setSalary(30000);
//dao.insert(employee);
//System.out.println("Employee information inserted");

ArrayList<Employee> em1=(ArrayList<Employee>)dao.selectAll();
for(Employee e:em1)
{
	System.out.println(e);
}
}

}
