import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    /**
     * 测试注入非自定义Bean
     */
    @Test
    public void test01(){
//        DruidDataSource druidDataSource = new DruidDataSource();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        DruidDataSource dataSource = (DruidDataSource) applicationContext.getBean("dataSource");
        String password = dataSource.getPassword();
        String username = dataSource.getUsername();
        System.out.println(dataSource);
        System.out.println(username);
        System.out.println(password);
    }

    @Test
    public void test02() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.liubj.dao.UserDao");
        System.out.println(aClass);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object clazz = applicationContext.getBean("clazz");
        System.out.println(clazz);

    }
}
