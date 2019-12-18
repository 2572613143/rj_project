package com.jdbc_;

import java.sql.*;



public class Gengxin {

	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		Connection lianjie= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc", "root", "jyc1014");
		//通过连接对象获得语句
		Statement yuju= lianjie.createStatement();
		//定义更新sql语句
		String sql="update tb_user set email = 'jack@qq.com' where id=1";
		//通过语句对象执行sql
		yuju.execute(sql);
	}

}
