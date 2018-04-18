package com.luoy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luoy.vo.Classroom;
import com.luoy.vo.Student;

@RestController
@RequestMapping("/hello")
public class HelloController {

	private final static Logger logger = LoggerFactory.getLogger(com.luoy.controller.HelloController.class);
	
	@RequestMapping("/test")
	public Student print(String str) {
		Classroom cl=new Classroom("123456","一班");
		Student student=new Student("23",26,cl);
		logger.info("日志info");
		logger.debug("日志debug");
		logger.error("日志error");
		
		return student;
	}
}
