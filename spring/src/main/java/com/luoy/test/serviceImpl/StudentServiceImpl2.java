package com.luoy.test.serviceImpl;

import org.springframework.stereotype.Service;

import com.luoy.test.service.StudentService;
@Service
public class StudentServiceImpl2 implements StudentService {

	@Override
	public void print() {
		System.out.println("this is XiaoHong");
	}

}
