package com.internousdev.ecsite_kishi.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware{

	private String errorMessage;
	public Map<String,Object> session;
	public String execute(){
		session.clear();
	return SUCCESS;
	}

	public void getErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}

	public String setErrorMessage(String errorMessage){
		return errorMessage;
	}

	@Override
	public void setSession(Map<String,Object> session){
		 this.session=session;
	}
}
