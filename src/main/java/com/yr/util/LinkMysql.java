package com.yr.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * 
 * @作者 林水桥
 * 2017年12月28日下午9:30:41
 */
public class LinkMysql {
	/**
	 * 连接数据库
	 * Connection
	 * 2017年12月28日下午9:31:23
	 */
		public Connection getCon(){
			Connection conn=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn=(Connection) DriverManager.getConnection("jdbc:mysql://192.168.1.36:3306/project?useUnicode=true&characterEncoding=UTF-8","root","5209");//#123LiuCong1106218	
			} catch (Exception e) {
				e.printStackTrace();
			}
			return conn;
		}
		
		/**
		 * 关闭数据库
		 * @param conn
		 */
		public static void close(Connection conn,PreparedStatement prepar,ResultSet resu,Statement stat) {

			try {
				if(resu!=null){
					resu.close();
				}
				if(prepar!=null){
					prepar.close();
				}
				if(stat!=null){
					stat.close();
				}
				if(conn!=null){
				 conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
}
