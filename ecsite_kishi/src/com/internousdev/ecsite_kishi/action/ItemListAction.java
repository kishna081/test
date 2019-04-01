package com.internousdev.ecsite_kishi.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite_kishi.dto.IteminfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	private ArrayList<IteminfoDTO> ItemList = new ArrayList<IteminfoDTO>();


	public String execute()throws SQLException{
		//ログインしてるか確認。未ログインの場合はlogin.jspに戻す
		if(!session.containsKey("id")){
			return ERROR;

		}else{
		String result = SUCCESS;
		return result;
		}
	}


	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

	public ArrayList<IteminfoDTO> getItemList(){
		return this.ItemList;
	}


}