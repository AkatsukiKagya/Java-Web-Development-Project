import com.zisu.Mybatis.mapper.UserMapper;
import com.zisu.Mybatis.pojo.Clazz;
import com.zisu.Mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    // @Test
    public void TestGetUserByUserid() throws IOException {
        // 获取核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 获取sql的会话对象SqlSession(不会自动提交事务)，是MyBatis提供的操作数据库的对象
        // SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取sql的会话对象SqlSession(会自动提交事务)，是MyBatis提供的操作数据库的对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 获取UserMapper的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 根据username查找user
        User user = mapper.getUserByUserid(2);
        System.out.println(user);
        // 提交事务-没有自动提交事务时，使用显式的方式的提交事务
        // sqlSession.commit();
        // 关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void TestUpdateUserByUserid() throws IOException {
        // 获取核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 获取sql的会话对象SqlSession(不会自动提交事务)，是MyBatis提供的操作数据库的对象
        // SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取sql的会话对象SqlSession(会自动提交事务)，是MyBatis提供的操作数据库的对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 获取UserMapper的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // User user = new User("22", "2222");
        User user = new User();
        user.setUserid("22");
        user.setUsername("2222");
        Integer count = mapper.updateUser(user);
        System.out.println("更新");
        // 提交事务-没有自动提交事务时，使用显式的方式的提交事务
        // sqlSession.commit();
        // 关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void TestDeleteUserByUserid() throws IOException {
        // 获取核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 获取sql的会话对象SqlSession(不会自动提交事务)，是MyBatis提供的操作数据库的对象
        // SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取sql的会话对象SqlSession(会自动提交事务)，是MyBatis提供的操作数据库的对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 获取UserMapper的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer count = mapper.deleteUserById(5);
        System.out.println("删除");
        // 提交事务-没有自动提交事务时，使用显式的方式的提交事务
        // sqlSession.commit();
        // 关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void TestBatchInsertUsers() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = Arrays.asList(
                new User(null, "BatchUser01"),
                new User(null, "BatchUser02"),
                new User(null, "BatchUser03")
        );
        Integer count = mapper.batchInsertUsers(users);
        System.out.println("批量插入条数: " + count);

        sqlSession.close();
    }

    @Test
    public void TestGetClazzWithCoursesById() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Clazz clazz = mapper.getClazzWithCoursesById("2001");
        System.out.println("班级及课程信息: " + clazz);

        sqlSession.close();
    }

}
