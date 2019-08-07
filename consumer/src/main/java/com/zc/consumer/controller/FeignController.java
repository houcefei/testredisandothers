package com.zc.consumer.controller;

import com.zc.consumer.pojo.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Service
@FeignClient(value = "provider",fallback = StudentError.class)
public interface FeignController {
    @RequestMapping(value="/getAllStudents/{pageNum}/{pageSize}")
    public List<Student> getAllStudents(@PathVariable("pageNum")int pageNum, @PathVariable("pageSize") int pageSize);
}
