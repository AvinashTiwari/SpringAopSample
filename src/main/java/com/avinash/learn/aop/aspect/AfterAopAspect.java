package com.avinash.learn.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@AfterReturning(value = "com.avinash.learn.aop.aspect.CommonJoinPointConfig.bussinessLayerExecution()", returning = "result")
	public void after(JoinPoint joinPoint, Object result) {
		logger.info("{} Resturn value of this {} ", joinPoint, result);
	}

	@AfterThrowing(value = "com.avinash.learn.aop.aspect.CommonJoinPointConfig.bussinessLayerExecution()", throwing = "execption")
	public void afterThrowing(JoinPoint joinPoint, Object execption) {
		logger.info("{} Execption thrown {} ", joinPoint, execption);
	}

	@After(value = "com.avinash.learn.aop.aspect.CommonJoinPointConfig.bussinessLayerExecution()")
	public void after(JoinPoint joinPoint) {
		logger.info("After execcution {} ", joinPoint);

	}

}
