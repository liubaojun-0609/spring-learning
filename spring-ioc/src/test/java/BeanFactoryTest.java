import com.liubj.dao.UserDao;
import com.liubj.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTest {

    @Test
    public void test01(){
        //定义BeanFactory
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        //设置读取器
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        //读取配置文件交给Factory创建对象
        reader.loadBeanDefinitions("beans.xml");
        //根据id获取相关对象
        UserService userService = (UserService) factory.getBean("userService");
        System.out.println(userService);
        UserDao userDao = (UserDao) factory.getBean("userDao");
        System.out.println(userDao);
    }
}
