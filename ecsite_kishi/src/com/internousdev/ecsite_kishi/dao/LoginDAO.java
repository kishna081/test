package com.internousdev.ecsite_kishi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite_kishi.dto.LoginDTO;
import com.internousdev.ecsite_kishi.util.DBConnector;

public class LoginDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private LoginDTO loginDTO = new LoginDTO();

	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){
		String sql="SELECT * FROM login_user_transaction3 where login_id = ? AND login_pass = ?";

		try{
			PreparedStatement preparedstatement = connection.prepareStatement(sql);

			preparedstatement.setString(1,loginUserId);
			preparedstatement.setString(2,loginPassword);

			ResultSet resultSet = preparedstatement.executeQuery();

			if(resultSet.next()){
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setUserName(resultSet.getString("user_name"));

				if(!(resultSet.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return loginDTO;
	}

	public LoginDTO getLoginDTO(){
		return loginDTO;
	}
}
