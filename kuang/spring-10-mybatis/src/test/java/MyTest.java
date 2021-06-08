import com.sun.xml.internal.ws.util.xml.ContentHandlerToXMLStreamWriter;
import com.zlx.mybatis.entity.User;
import com.zlx.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.apache.ibatis.io.Resources;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {

    @Test
    public void test() throws IOException {
//        String resouces="mybatis-config.xml";
//        InputStream in= Resources.getResourceAsStream(resouces);
//        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(in);
//        SqlSession sqlSession =sessionFactory.openSession(true);
//
//        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
//        List<User> userList= mapper.selectUser();
//
//        for (User user:userList){
//            System.out.println(user);
//        }

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dap.xml");
//        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
        
    }
}
