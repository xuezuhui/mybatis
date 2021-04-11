package com;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.Alias;

import java.util.List;
import java.util.Map;

/**
 * 需要视频资料或者咨询课程的可以加若曦老师的QQ：2408349392
 * author：鲁班学院-商鞅老师
 */
//@Alias("DemoMapper")
//  @Mapper
public interface DemoMapper {

  //@Select("select * from test")
  public List<Map<String,Object>>  selectAll(Map<String,Object> map);

}
