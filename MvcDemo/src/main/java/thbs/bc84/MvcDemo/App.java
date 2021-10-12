 package thbs.bc84.MvcDemo;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

/**
* Hello world!
*
*/
public class App
{
public static void main( String[] args )
{
ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");
BookDAO1 dao = (BookDAO1)ctx.getBean("bookDAO");
Book book = new Book();
book.setBookId(999);
book.setBookName("hungama");
book.setBookPrice(1000);
dao.insert(book);
System.out.println("Book inserted");
Book search = dao.select(23);
System.out.println(search.getBookId()+" "+search.getBookName()+" "+search.getBookPrice());
((ClassPathXmlApplicationContext)ctx).close();
 
 
// ctx.close();
}
}