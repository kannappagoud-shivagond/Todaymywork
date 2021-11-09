package pack1.TrainProjectJdbcDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");
    	
    	TrainDAO1 dao = (TrainDAO1)ctx.getBean("trainDAO");
    	Train train = new Train();
    	train.setTrainNo(1009);
    	train.setTrainName("Belagavi Express");
    	train.setSource("Belagavi");
    	train.setDistination("Bengalore");
    	train.setPrice(3000);
    	dao.insert(train);
    	System.out.println(" train inserted");
    	
    	Train search=dao.select(1007);
    	System.out.println(search.getTrainNo()+"  "+search.getTrainName()+"  "+search.getSource()+"  "+search.getDistination()+"   "+search.getPrice());
    }
}
