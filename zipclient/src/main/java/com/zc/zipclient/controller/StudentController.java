package com.zc.zipclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zc.zipclient.pojo.Student;
import com.zc.zipclient.service.FeignService;

import java.util.List;

/**
 * @author hcf
 * @create 2019-08-05 14:46
 */
@RestController

public class StudentController {
    @Autowired
    FeignService feignService;
    @RequestMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        List<Student> a=feignService.getAllStudents(1,1);
        return a;
    }

}
