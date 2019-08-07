/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ClassController
 * Author:   Administrator
 * Date:     2019/7/31 14:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zc.provider.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zc.provider.pojo.Student;
import com.zc.provider.service.StudenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/7/31
 * @since 1.0.0
 */
@RestController
@RequestMapping("/student")
@CacheConfig(cacheNames = "student")
public class ClassController {
    @Autowired
    StudenService studenService;

    @RequestMapping("/getStudent/{id}")
    @Cacheable( key="'student_'+#id")
    public Student getStudent(@PathVariable("id") int id){
        return studenService.getById(id);
    }
    @RequestMapping("/addStudent/{id}/{sName}/{classId}")
    @CachePut(key="'student_'+#id")
    public Student updateStudent(@PathVariable("id") int id,@PathVariable("sName") String sName,@PathVariable("classId") int classId){
        studenService.addStudent(id, sName,classId );
        Student student=new Student();
        student.setsId(id);
        student.setsName(sName);
        student.setClassId(classId);
        return  student;
    }
    @RequestMapping("/deleteStudent/{id}")
    @CacheEvict(key="'student_'+#id")
    public void deleteStudent(@PathVariable("id") int id){
        studenService.deleteStudent(id);
    }

    @RequestMapping("/getAllStudents/{pageNum}/{pageSize}")
    public List<Student> getAllStudents(@PathVariable("pageNum")int pageNum,@PathVariable("pageSize") int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Student> students=studenService.getAllStudents();
        PageInfo<Student> appsPageInfo = new PageInfo<Student>(students);
        return students;
    }
}



