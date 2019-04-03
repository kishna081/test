package com.internousdev.ecsite_kishi.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite_kishi.dao.BuyItemDAO;
import com.internousdev.ecsite_kishi.dao.LoginDAO;
import com.internousdev.ecsite_kishi.dto.BuyItemDTO;
import com.internousdev.ecsite_kishi.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	public Map<String,Object> session;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();
	private BuyItemDAO buyItemDAO = new BuyItemDAO();

	public String execute(){
		loginDTO = loginDAO.getLoginUserInfo(loginUserId,loginPassword);
		session.put("loginUser",loginDTO);
//登録されているユーザーの場合（問題なくログインできる）
		if(((LoginDTO) session.get("loginUser")).getLoginFlg()){
			String result = SUCCESS;
			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();

			session.put("login_user_id",loginDTO.getLoginId());
			session.put("id",buyItemDTO.getId());
			session.put("buyItem_name",buyItemDTO.getItemName());
			session.put("buyItem_price",buyItemDTO.getItemPrice());
			
//SUCCESSを戻す。BuyItem画面へ
			return result;
			
//管理者だけがログインできるid/passwordだったときは管理者ページへ遷移
//		}else if() {
//			String result = "admin";
//			
//			return result;
//			
//未登録ユーザーだったときはエラーのログイン画面を戻す
		}else {
		return ERROR;
		}
	}
	
	public String getLogniUserId(){
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
