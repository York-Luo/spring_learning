package com.luoy.test.serviceImpl;



import java.net.URL;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import com.luoy.test.service.StudentService;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Component
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"}) 
public class StudentServiceImplTest {

	/*@Autowired
	@Qualifier("studentServiceImpl")*/
	@Resource(name="studentServiceImpl")
	private StudentService studentService;

	
	
	
	
	public static void main(String[] args) {

		ClassPathXmlApplicationContext cat = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		StudentService ss=cat.getBean(StudentServiceImpl.class);
		ss.print();
		
		URL url=StudentServiceImplTest.class.getResource(".");
		System.out.println("url:"+url);
	}

	
	
	
	@Test
	public void testPrint() {
		studentService.print();
	}

}
