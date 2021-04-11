package com;

import com.alibaba.druid.pool.DruidDataSource;
import com.mysql.jdbc.Driver;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * 需要视频资料或者咨询课程的可以加若曦老师的QQ：2408349392
 * author：鲁班学院-商鞅老师
 */
public class Test {

  public static void main(String[] args) throws Exception {
    String resource = "mybatis.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    //从调用者角度来讲 与数据库打交道的对象 SqlSession

    //通过动态代理 去帮我们执行SQL
    DemoMapper mapper = sqlSession.getMapper(DemoMapper.class);
    Map<String,Object> map = new HashMap<>();
    map.put("id","1");
    System.out.println(mapper.selectAll(map));
    sqlSession.close();
  }
}
