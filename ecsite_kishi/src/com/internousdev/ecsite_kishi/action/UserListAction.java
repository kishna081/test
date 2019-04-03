package com.internousdev.ecsite_kishi.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite_kishi.dao.UserListDAO;
import com.internousdev.ecsite_kishi.dto.UserinfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	//userList.jspが参照するリスト
	private ArrayList<UserinfoDTO> UserList = new ArrayList<UserinfoDTO>();
	UserListDAO dao = new UserListDAO();

	public String execute()throws SQLException{
		UserList = dao.getUserInfo();

		//ログイン確認
		if(!session.containsKey("id")){
			return ERROR;
		}

		else{
			session.put("UserList", UserList);
			String result = SUCCESS;

			return result;
		}
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

	public ArrayList<UserinfoDTO> getUserList(){
		return this.UserList;
		}
}
