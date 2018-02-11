package com.avinash.learn.aop.bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avinash.learn.aop.data.*;

@Service
public class Bussiness2 {

	@Autowired
	private Dao2 dao2;
	public String calculateSomethig()
	{
		return dao2.retriveSomething();
		
	}
}
