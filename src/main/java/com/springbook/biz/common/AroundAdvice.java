package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("[공통로그 사전처리1]");
		Object retObject = pjp.proceed();
		System.out.println("[공통로그 사후처리2]");
		return retObject;
	}
}
