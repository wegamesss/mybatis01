package com.lfq.entry;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;

public class demotest {
    @Test
    public void test() throws Exception{

        String resource = "mybatis.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        List<users> usersList=session.selectList("userList");
        usersList.forEach(e->{
            System.err.println(e);
        });
        session.close();

    }

}
