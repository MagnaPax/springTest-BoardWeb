package com.springbook.ioc.injection;

import java.util.*;

public class CollectionBean {
	
	private List<String> addressList;
	
	public void setAddressList(List<String> addresslist) {
		this.addressList=addresslist;
		
	}
	public List<String> getAddressList() {
		return addressList;		
	}

}
