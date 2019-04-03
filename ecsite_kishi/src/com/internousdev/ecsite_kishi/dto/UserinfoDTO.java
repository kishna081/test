package com.internousdev.ecsite_kishi.dto;

public class UserinfoDTO {

	public String id;
	public String loginId;
	public String loginPass;
	public String userName;
	public String insert_date;

	public String getId(){
		return this.id;
	}

	public void setId(String id){
		this.id=id;
	}

	public String getLoginId(){
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId=loginId;
	}

	public String getLoginPass(){
		return this.loginPass;
	}

	public void setLoginPass(String loginPass){
		this.loginPass=loginPass;
	}

	public String getUserName(){
		return this.userName;
	}

	public void setUserName(String userName){
		this.userName=userName;
	}

	public String getInsert_date(){
		return this.insert_date;
	}

	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}



}
