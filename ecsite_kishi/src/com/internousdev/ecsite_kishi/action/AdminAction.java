package com.internousdev.ecsite_kishi.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport implements SessionAware{
	
	public Map<String,Object> session;
	
		public String execute(){
			if(!session.containsKey("id")){
				return ERROR;
			
			}else {
			return SUCCESS;
			}
		}
		
		@Override
		public void setSession(Map<String,Object> session) {
			this.session=session;
		}

	}

