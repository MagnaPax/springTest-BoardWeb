package com.springbook.ioc.injection;

import java.util.*;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanSetClient {
	
	public static void main(String[] args) {
		AbstractApplicationContext factory=	
				new GenericXmlApplicationContext("applicationContext.xml");
		beanSet bean =
				(beanSet)factory.getBean("beanSet");
		Set<String> addressList2= bean.getAddressList2();
		for(String address:addressList2) {
			System.out.println(address);
		}
		factory.close();
	}

}
