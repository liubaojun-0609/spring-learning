import com.liubj.dao.PersonDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanProcessorTest {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-processor.xml");
        PersonDao personDao = (PersonDao) context.getBean("personDaoImpl");
        System.out.println(personDao);
    }
}
