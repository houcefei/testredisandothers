/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StudentError
 * Author:   Administrator
 * Date:     2019/8/2 11:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zc.feign.service;

import com.zc.feign.pojo.Student;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/8/2
 * @since 1.0.0
 */
@Component
public class StudentError implements FeignService{


    public List<Student> getAllStudents(int pageNum, int pageSize) {
        return null;
    }
}



