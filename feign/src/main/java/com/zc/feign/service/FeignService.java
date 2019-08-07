package com.zc.feign.service;

import com.zc.feign.pojo.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author hcf
 * @create 2019-08-05 14:43
 */
@Service
@FeignClient(value = "provider",fallback = StudentError.class)
public interface FeignService {
    @RequestMapping(value="/student/getAllStudents/{pageNum}/{pageSize}")
    public List<Student> getAllStudents(@PathVariable("pageNum")int pageNum, @PathVariable("pageSize") int pageSize);
}
