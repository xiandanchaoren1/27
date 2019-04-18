package com.chen.test;

import com.chen.po.Student;
import com.chen.util.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMoHu {
//    public static void main(String[] args) throws IOException {
    @Test
    public void TestM() {
        SqlSession sqlSession = MybatisUtils.getSqlSession(true);
/*        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession =sqlSessionFactory.openSession();*/

        Map<String, Object> map = new HashMap<>();
        String sname = "sname";
        String name = "3";
        int pageNum = 1;
        int pageSize = 2;
        int start = (pageNum - 1) * pageSize;

        map.put("sname", sname);
        map.put("name", name);
        map.put("start", start);
        map.put("pageSize", pageSize);

        List<Student> students = sqlSession.selectList("findAllByColumnLike", map);

        for (Student student : students) {
            System.out.println(student);
        }
        MybatisUtils.closeSqlSession(sqlSession);
    }

}
