/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StudentServiceImp
 * Author:   Administrator
 * Date:     2019/7/31 11:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zc.provider.service.implement;

import com.zc.provider.dao.StudentMapper;
import com.zc.provider.pojo.Student;
import com.zc.provider.service.StudenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/7/31
 * @since 1.0.0
 */
@Service
public class StudentServiceImp  implements StudenService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public Student getById(int id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addStudent(int id,String sName,int classId){
        Student student=new Student();
        student.setsId(id);
        student.setsName(sName);
        student.setClassId(classId);
        return studentMapper.updateByPrimaryKey(student);
    }

    @Override
    public int deleteStudent(int id) {
        return studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentMapper.getAllStudents();
    }
}



