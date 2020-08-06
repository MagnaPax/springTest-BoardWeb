package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class AroundAdvice {
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		String method = pjp.getSignature().getName();
		StopWatch stopWatch = new StopWatch();

		System.out.println("[처리시작]");
		stopWatch.start();
		Object retObject = pjp.proceed();
		stopWatch.stop();

		System.out.println("[처리종료]" + method + " delay : " + stopWatch.getTotalTimeMillis() + "(ms초)");

		return retObject;
	}
}
