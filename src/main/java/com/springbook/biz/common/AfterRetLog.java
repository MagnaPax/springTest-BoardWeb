package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserVO;
import com.sun.org.apache.bcel.internal.generic.RETURN;

@Service
@Aspect
public class AfterRetLog {
	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut() {}

	@AfterReturning(pointcut = "getPointcut()",returning = "returnObj")
	public void afterLog(JoinPoint jp,Object returnObj) {
		String method = jp.getSignature().getName();
		String userName="";
		if(returnObj instanceof UserVO) {
			UserVO userVO =(UserVO) returnObj;
			userName=userVO.getUname();
		}else {
			userName="Not UserVO";
		}
		
		System.out.println("[AnnoAop] ¸Þ¼­µå:" + method +" UserName:"+userName );
	}
	/*
	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut() {}
	*/
}
