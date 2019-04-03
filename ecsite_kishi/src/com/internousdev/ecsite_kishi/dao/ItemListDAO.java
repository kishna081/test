package com.internousdev.ecsite_kishi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite_kishi.dto.IteminfoDTO;
import com.internousdev.ecsite_kishi.util.DBConnector;

public class ItemListDAO{

	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();

	public ArrayList<IteminfoDTO> getItemCreateInfo()throws SQLException{
		ArrayList<IteminfoDTO> iteminfoDTO = new ArrayList<IteminfoDTO>();

		String sql="SELECT * FROM item_info_transaction4";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				IteminfoDTO dto = new IteminfoDTO();
				dto.setId(resultSet.getString("id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getString("item_price"));
				dto.setItemStock(resultSet.getString("item_stock"));
				dto.setInsert_date(resultSet.getString("insert_date"));
				iteminfoDTO.add(dto);
			}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}

		return iteminfoDTO;
	}


}
