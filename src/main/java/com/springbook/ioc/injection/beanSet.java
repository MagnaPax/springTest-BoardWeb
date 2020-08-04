package com.springbook.ioc.injection;

import java.util.*;

public class beanSet {

	private Set<String> addressList2;
	
	public void setAddressList2(Set<String> addresslist2) {
		this.addressList2=addresslist2;
		
	}
	public Set<String> getAddressList2() {
		return addressList2;		
	}
}
