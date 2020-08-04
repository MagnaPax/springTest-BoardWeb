package com.springbook.ioc.injection;

import java.util.Properties;

public class BeanProp {
	private Properties addressList4;
	
	public void setAddressList4(Properties addresslist4) {
		this.addressList4=addresslist4;
		
	}
	public Properties getAddressList4() {
		return addressList4;		
	}
}
