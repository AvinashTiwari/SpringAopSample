package com.avinash.learn.aop.bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avinash.learn.aop.data.*;

@Service
public class Bussiness1 {

	@Autowired
	private Dao1 dao1;
	public String calculateSomethig()
	{
		return dao1.retriveSomething();
		
	}
}
