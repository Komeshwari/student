package com.stu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.stu.entity.StudentD;
import com.stu.repo.StudentRepo;

@Service
public class StudentDServiceImp implements StudentDService{

@Autowired
private StudentRepo repo;
 
public StudentD saveStudent(StudentD std)
{
	StudentD std1=repo.save(std);
	return std1;
}
 
public StudentD updateStudent(StudentD std)
{
	return repo.save(std);
}
public String deleteD(Integer stdId)
{
	String temp=" ";
	if(repo.findById(stdId).isPresent())
	{
		repo.deleteById(stdId);
		temp="Sucessfully Deleted";
	}
	else 
	{
		temp="Deletion failed!";
	}
	return temp;
}

public StudentD retriveStudent(StudentD std)//retriving
{
		StudentD std2=repo.save(std);
		return std2;
}


}
