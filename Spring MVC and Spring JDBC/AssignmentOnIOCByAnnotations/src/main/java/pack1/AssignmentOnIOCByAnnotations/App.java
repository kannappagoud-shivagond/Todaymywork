package pack1.AssignmentOnIOCByAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.scan("pack1");
        context.refresh();
        Student student=(Student)context.getBean("student");
        student.setId(10);
        student.setName("darshan");
        Chair chair=student.getChair();
        chair.setSeatNo(101);
        chair.setColour("blue");
        
        System.out.println(student);
        
        
        
    }
}
