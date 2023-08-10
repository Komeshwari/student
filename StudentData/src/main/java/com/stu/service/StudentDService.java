package com.stu.service;

import java.util.List;

import com.stu.entity.StudentD;


public interface StudentDService {
StudentD saveStudent(StudentD std);
StudentD updateStudent(StudentD std);
public String deleteD(Integer stdId);
StudentD retriveStudent(StudentD stu);
}

