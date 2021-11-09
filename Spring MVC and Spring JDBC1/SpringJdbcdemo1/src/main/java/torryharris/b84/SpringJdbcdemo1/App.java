package torryharris.b84.SpringJdbcdemo1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
public static void main( String[] args )
{
ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");

BookDAO1 dao = (BookDAO1)ctx.getBean("bookDAO");
Book book = new Book();
book.setBookId(1009);
book.setBookName("JDBC");
book.setBookPrice(5550);
System.out.println("Inserted");
System.out.println(book);
dao.insert(book);

Book search = dao.select(555);
System.out.println(search.getBookId()+" "+search.getBookName()+" "+search.getBookPrice());

// ctx.close();
//System.out.println(dao.selectAll());
((ClassPathXmlApplicationContext)ctx).close();
}
}