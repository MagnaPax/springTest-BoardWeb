package com.springbook.ioc.injection;

import java.util.Map;

public class BeanMap {
	private Map<String,String> addressList3;
	
	public void setAddressList3(Map<String,String> addresslist3) {
		this.addressList3=addresslist3;
		
	}
	public Map<String,String> getAddressList3() {
		return addressList3;		
	}
}
