package com.internousdev.ecsite_kishi.dto;

public class BuyItemDTO {

	public int id;
	public String itemName;
	public String itemPrice;
	
	//publicなのにgetter/setterが必要？
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

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id=id;
	}

}
