import com.liubj.beans.OtherBean;
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

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-processor.xml");
        OtherBean otherBean = (OtherBean) context.getBean("otherBean");
        System.out.println(otherBean);
    }
}
