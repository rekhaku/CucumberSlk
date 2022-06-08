package com.cucumber.pages;


import com.cucumber.utils.PageUtils;

public class BasePageObject {

	protected String id ;
	protected String address;
	protected String webTitle;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWebTitle() {
		return webTitle;
	}

	public void setWebTitle(String webTitle) {
		this.webTitle = webTitle;
	}
	
	

	
}
