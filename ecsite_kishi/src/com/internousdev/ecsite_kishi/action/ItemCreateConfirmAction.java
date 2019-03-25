package com.internousdev.ecsite_kishi.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class ItemCreateConfirmAction extends ActionSupport implements SessionAware{

	private String itemName;
	private int itemPrice;
	private int itemStock;
	public Map<String,Object> session;
	private String errorMassage;

	public String execute(){
		String result = SUCCESS;
		if(!(itemName.equals(""))
		&& (!(itemPrice<=0))
		&& (!(itemStock<=0))){
			session.put("itemName", itemName);
			session.put("itemPrice", itemPrice);
			session.put("itemStock", itemStock);
	}else{
		setErrorMassage("入力内容が正しくありません。");
		result=ERROR;
	}
		return result;
}

	// getterとsetter
	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName=itemName;
	}

	public int getItemPrice(){
		return itemPrice;
	}

	public void setItemPrice(int itemPrice){
		this.itemPrice=itemPrice;
	}

	public int getItemStock(){
		return itemStock;
	}

	public void setItemStock(int itemStock){
		this.itemStock=itemStock;
	}

	public String getErrorMassage(){
		return errorMassage;
	}

	public void setErrorMassage(String errorMassage){
		this.errorMassage=errorMassage;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}

