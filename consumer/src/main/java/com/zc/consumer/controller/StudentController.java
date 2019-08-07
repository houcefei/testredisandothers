/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StudentClass
 * Author:   Administrator
 * Date:     2019/8/1 16:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zc.consumer.controller;

import com.zc.consumer.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2019/8/1
 * @since 1.0.0
 */
@RestController
public class StudentController {
    @Resource
    FeignController feinController;

   /* @RequestMapping("/getStudent/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        Student student = restTemplate.getForEntity("http://provider/student/getStudent/{id}", Student.class, id).getBody();
        return student;
    }*/

    /*   @RequestMapping("/getAllStudents")
       public List<Student> getAllStudents() {
           Map<String, Integer> params = new HashMap<String, Integer>();
           params.put("pageNum", 1);
           params.put("pageSize", 2);
           return restTemplate.getForObject("http://provider/student/getAllStudents/{pageNum}/{pageSize}", List.class, params);
       }*/
    @RequestMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        List<Student> a=feinController.getAllStudents(1,1);
        return a;
    }
}



