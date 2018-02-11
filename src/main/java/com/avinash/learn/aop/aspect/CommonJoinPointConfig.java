package com.avinash.learn.aop.aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	@Pointcut("execution(* com.avinash.learn.aop..*.*(..))")
    public void dataLayerExecution()
    {
		
    }
	
	@Pointcut("execution(* com.avinash.learn.aop.bussiness.*.*(..))")
    public void bussinessLayerExecution()
    {
		
    }
	
	@Pointcut("com.avinash.learn.aop.aspect.CommonJoinPointConfig.dataLayerExecution() && com.avinash.learn.aop.aspect.CommonJoinPointConfig.bussinessLayerExecution() ")
	public void alllayer()
	{}
	
	@Pointcut("bean(dao*)")
	public void beanNamePointCut()
	{}
	
	@Pointcut("bean(*dao*)")
	public void beanConatinPointCut()
	{}
	
	@Pointcut("within(com.avinash.learn.aop..*)")
	public void withinDataLayer()
	{}
	
	@Pointcut("@annotation(com.avinash.learn.aop.data.aop.aspect.TrackTime)")
	public void trackAnnotation()
	{}
}
