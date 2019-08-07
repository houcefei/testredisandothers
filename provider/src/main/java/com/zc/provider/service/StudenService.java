package com.zc.provider.service;

import com.zc.provider.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudenService {
    public Student getById(int id);

    public int addStudent(int id, String sName, int classId);

    public int deleteStudent(int id);

    public List<Student> getAllStudents();
}