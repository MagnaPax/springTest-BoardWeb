package com.springbook.ioc.injection;

import java.util.*;
import java.util.Map.Entry;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanPropClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		BeanProp bean = (BeanProp) factory.getBean("beanProp");
		Properties addressList3 = bean.getAddressList4();
		for (Entry<Object, Object> entry : addressList4.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		factory.close();
	}
}
