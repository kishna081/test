package com.internousdev.ecsite_kishi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite_kishi.dto.UserinfoDTO;
import com.internousdev.ecsite_kishi.util.DBConnector;

public class UserListDAO {

	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();

	//★以下、DBからデータを取得する。→UserListActionでUserListに格納する
	public ArrayList<UserinfoDTO> getUserInfo()throws SQLException{

	//★Actionで使用いているuserListに代入するリストを作成
	ArrayList<UserinfoDTO> userinfoDTO = new ArrayList<UserinfoDTO>();



		String sql="SELECT * FROM login_user_transaction4";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
	//★DTOのインスタンス作成、セッターとゲッターにデータを代入
				UserinfoDTO dto = new UserinfoDTO();
				dto.setId(resultSet.getString("id"));
				dto.setLoginId(resultSet.getString("login_id"));
				dto.setLoginPass(resultSet.getString("login_pass"));
				dto.setUserName(resultSet.getString("user_name"));
				dto.setInsert_date(resultSet.getString("insert_date"));
				userinfoDTO.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}

		return userinfoDTO;


	}

}
