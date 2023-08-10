package com.stu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stu.entity.StudentD;

public interface StudentRepo extends JpaRepository<StudentD,Integer> {

}
