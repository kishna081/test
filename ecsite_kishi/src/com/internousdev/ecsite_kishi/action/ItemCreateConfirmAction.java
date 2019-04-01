package com.internousdev.ecsite_kishi.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class ItemCreateConfirmAction extends ActionSupport implements SessionAware{

	private String itemName;
	private String itemPrice;
	private String itemStock;
	public Map<String,Object> session;
	private String errorMassage;

	public String execute(){
		String result = SUCCESS;
		if(!(itemName.equals(""))
		&& (itemPrice.matches("[0-9]+"))
		&& (itemStock.matches("[0-9]+"))){
			session.put("itemName", itemName);
			session.put("itemPrice", itemPrice);
			session.put("itemStock", itemStock);
	}else{
		setErrorMassage("入力内容が正しくありません。"
				+ "在庫・値段は半角英数字のみ登録が可能です。");
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

	public String getItemPrice(){
		return itemPrice;
	}

	public void setItemPrice(String itemPrice){
		this.itemPrice=itemPrice;
	}

	public String getItemStock(){
		return itemStock;
	}

	public void setItemStock(String itemStock){
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

