package com.avinash.learn.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Around("com.avinash.learn.aop.aspect.CommonJoinPointConfig.bussinessLayerExecution()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long endtime = System.currentTimeMillis() - startTime;
		logger.info("Time taken by this {} is {} " ,joinPoint ,  endtime);
	}

}
