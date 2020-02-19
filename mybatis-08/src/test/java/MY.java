import com.demo.dao.BlogMapper;
import com.demo.pojo.Blog;
import com.demo.utils.IdUtils;
import com.demo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MY {
    public static void main(String[] args) {

    }
    @Test
    public void t(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IdUtils.getId());
        blog.setTitle("MyBatis");
        blog.setAuthor("K");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.add(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("CCCC");
        mapper.add(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("DDD");
        mapper.add(blog);

        sqlSession.close();
    }

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","DDD");
        map.put("author","K");
        List<Blog> blogs = mapper.BlogIF(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
