package com.jdbc_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Putong {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection lianjie= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc", "root", "jyc1014");
		//通过连接对象获得语句
		Statement yuju= lianjie.createStatement();
		//定义更新sql语句
		String sql="select * from tb_user";

		ResultSet rs=yuju.executeQuery(sql);
		System.out.println("id  |  name  |  sex");
		//遍历结果集
		while (rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String sex=rs.getString("sex");
			System.out.println(id+"  |  "+name+"  |  "+sex+"  |  ");
		}
	}
	

}
