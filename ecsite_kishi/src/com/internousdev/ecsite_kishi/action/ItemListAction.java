package com.internousdev.ecsite_kishi.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite_kishi.dao.ItemListDAO;
import com.internousdev.ecsite_kishi.dto.IteminfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	private ItemListDAO itemListDAO = new ItemListDAO();
	private ArrayList<IteminfoDTO> IteminfoDTO = new ArrayList<IteminfoDTO>();
	public String deleteFlg;
	public String message;


	public String execute()throws SQLException{
		if(!session.containsKey("id")){
			return ERROR;
		}

		if(deleteFlg == null){
			String item_transaction_id = session.get("id").toString();
			//以下と💤上記、購入情報の参照ではないからtransaction_idではなさそう　なに？
			//Itemlist = ItemListDAO.getIteminfo(item_transaction_id);
		}else if(deleteFlg.equals("1")){
			delete();
		}

		String result = SUCCESS;
		return result;
	}


	public void delete() throws SQLException{
		String item_transaction_id = session.get("id").toString();
		String master_id = session.get("login_user_id").toString();

		//以下メソッド作成する
		int res=ItemListDAO.createItemHistoryDelete(item_transaction_id)
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

	public ArrayList<IteminfoDTO> getIteminfoDTO(){
		return this.IteminfoDTO;
	}


}
