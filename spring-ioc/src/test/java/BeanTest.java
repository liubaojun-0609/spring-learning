import com.alibaba.druid.pool.DruidDataSource;
import com.mysql.cj.xdevapi.SessionFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

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

    @Test
    public void test03() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = builder.build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession();
        System.out.println(sqlSession);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
        System.out.println(sqlSessionFactory);
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        System.out.println(sqlSession1);
    }

}
