import com.demo.dao.TeacherMapper;
import com.demo.pojo.Teacher;
import com.demo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.get(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
