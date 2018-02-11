package com.avinash.learn.aop.data;

import org.springframework.stereotype.Repository;

import com.avinash.learn.aop.data.aop.aspect.TrackTime;

@Repository
public class Dao1 {
	
	@TrackTime
	public String retriveSomething()
	{
		return "Dao1";
	}

}
