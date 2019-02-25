package com.internousdev.ecsite_kishi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	/*
	 *使用するMySQLファイルの設定
	 */

	private static String driverName="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost/ecsite_kishi2";

	private static String user="root";
	private static String password="mysql";

	/*
	 * コネクションメソッド
	 */
	public Connection getConnection(){
		Connection con=null; //conの初期化

	try{
		Class.forName(driverName);
		con = (Connection) DriverManager.getConnection(url,user,password);

	}catch(ClassNotFoundException e){
		e.printStackTrace();

	}catch(SQLException e){
		e.printStackTrace();
	}

	return con; //MySQLに接続できたかどうか

	}
}
