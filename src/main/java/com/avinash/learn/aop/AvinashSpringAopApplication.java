package com.avinash.learn.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.avinash.learn.aop.bussiness.Bussiness1;
import com.avinash.learn.aop.bussiness.Bussiness2;

@SpringBootApplication
public class AvinashSpringAopApplication implements CommandLineRunner{
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	@Autowired
	Bussiness1 bussiness1;
	
	@Autowired
	Bussiness2 bussiness2;

	public static void main(String[] args) {
		SpringApplication.run(AvinashSpringAopApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		logger.info(bussiness1.calculateSomethig());
		logger.info(bussiness2.calculateSomethig());
	}
}
