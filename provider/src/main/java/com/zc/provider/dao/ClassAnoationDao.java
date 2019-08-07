/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ClassAnoationDao
 * Author:   Administrator
 * Date:     2019/7/31 9:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zc.provider.dao;

import org.apache.ibatis.annotations.*;
import org.aspectj.lang.annotation.Before;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/7/31
 * @since 1.0.0
 * des 通过注释的方式获取简单ddl操作数据
 */
@Mapper
public interface  ClassAnoationDao {

    @Select("select * from class")
    @Results({
            @Result(property = "cId", column = "c_id"),
            @Result(property = "cName",column = "c_name")
    })
    List<Class> getAllClasses();
    //使用@Insert注解指明add方法要执行的SQL
    @Insert("insert into class(c_name) values(#{cName})")
    @Options(keyProperty = "c_id",useGeneratedKeys = true)
    //@SelectKey(keyProperty = "c_id",before = true,statement = "select uuid() from ducl",resultType = "String.Class")
    public void add(Class c);

    @Delete("delete from class where c_id = #{cid}")
    void deleteInfo(int cid);

    @Update("update class set c_name = #{cName} where c_id = #{cid}")
    void updateInfo(Class classInfo);

}



