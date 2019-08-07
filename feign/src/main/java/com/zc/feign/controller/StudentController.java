package com.zc.feign.controller;

import com.zc.feign.pojo.Student;
import com.zc.feign.service.FeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hcf
 * @create 2019-08-05 14:46
 */
@RestController

public class StudentController {
    private static Logger logger= LoggerFactory.getLogger(StudentController.class);
    @Autowired
    FeignService feignService;
    @RequestMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        List<Student> a=feignService.getAllStudents(1,1);
        logger.info("======================================="+a.get(0).getsName());
        return a;
    }
}
