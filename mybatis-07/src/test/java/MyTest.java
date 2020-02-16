import com.demo.dao.TeacherMapper;
import com.demo.pojo.Teacher;
import com.demo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    public static void main(String[] args) {

    }
    @Test
    public void th(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Teacher teacher = sqlSession.getMapper(TeacherMapper.class).getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
