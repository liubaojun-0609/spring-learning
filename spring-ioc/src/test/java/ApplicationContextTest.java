import com.liubj.dao.UserDao;
import com.liubj.service.StudentService;
import com.liubj.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
//        UserService userService = (UserService) applicationContext.getBean("aaa");
        System.out.println(userService);
    }

    @Test
    public void test02(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
        System.out.println(userService);
        classPathXmlApplicationContext.close();
    }

    @Test
    public void test03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) applicationContext.getBean("userDao1");
        System.out.println(userDao1);
        UserDao userDao2 = (UserDao) applicationContext.getBean("userDao2");
        System.out.println(userDao2);
    }

    @Test
    public void test04(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao3 = (UserDao) applicationContext.getBean("userDao3");
        System.out.println(userDao3);
    }

    /**
     * 测试注入集合类属性
     */
    @Test
    public void test05(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext1.xml");
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        studentService.printMessage();
    }

    @Test
    public void test06(){
        //配置环境变量
        System.setProperty("spring.profiles.active","dev");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        UserDao userDaoDev = (UserDao) applicationContext.getBean("userDaoDev");
        System.out.println(userService);
        System.out.println(userDaoDev);
    }

    @Test
    public void test07(){
        System.setProperty("spring.profiles.active","prod");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        UserDao userDaoProd = (UserDao) applicationContext.getBean("userDaoProd");
        System.out.println(userService);
        System.out.println(userDaoProd);
    }

    @Test
    public void test08(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao-user");
        UserDao xxxUserDao = (UserDao) applicationContext.getBean("xxxUserDao");
        System.out.println(userDao);
        System.out.println(xxxUserDao);
    }

}
