package com.springbook.ioc.injection;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanMapClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory=	
				new GenericXmlApplicationContext("applicationContext.xml");
		BeanMap bean =
				(BeanMap)factory.getBean("beanMap");
		Map<String,String> addressList3= bean.getAddressList3();
		for(Map.Entry<String, String> entry:addressList3.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		factory.close();
	}

}
