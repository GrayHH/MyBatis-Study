import com.demo.dao.UserMapper;
import com.demo.pojo.User;
import com.demo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getId(1);
        System.out.println(user);

        User user2 = mapper.getId(2);
        System.out.println(user2);

        System.out.println(user==user2);
        sqlSession.close();
    }
}
