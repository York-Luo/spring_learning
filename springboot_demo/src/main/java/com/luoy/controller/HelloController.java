package com.luoy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luoy.vo.Classroom;
import com.luoy.vo.Student;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/test")
	public Student print(String str) {
		Classroom cl=new Classroom("123456","一班");
		Student student=new Student("23",26,cl);
		return student;
	}
}
