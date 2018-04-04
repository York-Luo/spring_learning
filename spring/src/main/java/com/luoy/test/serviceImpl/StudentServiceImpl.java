package com.luoy.test.serviceImpl;

import org.springframework.stereotype.Service;

import com.luoy.test.service.StudentService;
@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {

	@Override
	public void print() {
		System.out.println("this is xiaoMing");
	}

}
