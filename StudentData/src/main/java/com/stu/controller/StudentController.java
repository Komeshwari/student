package com.stu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stu.entity.StudentD;
import com.stu.service.StudentDServiceImp;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api

public class StudentController {
@Autowired
private StudentDServiceImp service;
@ApiOperation(value = "savemethod")
@PostMapping("/savestudent")//Post data into database

public String insertStu(@RequestBody StudentD std)
{
	String msg=null;
	StudentD std2=service.saveStudent(std);
	if(std2!=null)
	{
		msg="Student Registered Sucessfully!";
	}
	else
	{
		msg="failed registration!";
	}
	return msg;
}
@GetMapping("/retriveStudent")
public StudentD retData(@RequestBody StudentD std)
{
	StudentD ret=service.retriveStudent(std);
	return ret;
}
@PutMapping("/updateStudent")
public StudentD updateData(@RequestBody StudentD std)
{
	StudentD std1=service.updateStudent(std);
	return std1;
}
@DeleteMapping("/deleteStudent")
public String deleteMa(@RequestParam Integer stdId)
{
	return service.deleteD(stdId);
}
}
