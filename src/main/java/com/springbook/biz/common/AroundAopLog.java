package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class AroundAopLog {
	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut() {
	}

	@Around("getPointcut()")
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {

		String method = pjp.getSignature().getName();
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		Object object = pjp.proceed();
		stopWatch.stop();
		System.out.println("[AroundAop] 메서드:" + method + " 수행시간:" + stopWatch.getLastTaskTimeMillis());
		return object;
	}
	/*
	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut() {}
	*/
}
