package com.igeek.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=123456");
//			Statement s=cn.createStatement();
//			
		//String sql="update emp set job='manager' where empno=7369";
//			s.executeUpdate(sql);
//			sql="select * from emp";
//			ResultSet rs=s.executeQuery(sql);
//			while(rs.next()){
//				for(int i=0;i<8;i++){
//					System.out.print(rs.getObject(i+1)+"	");
//				}
//				System.out.println();
//			}
		String	sql="select * from emp where empno= ? ";
			PreparedStatement ps =cn.prepareStatement(sql);
			ps.setObject(1, 7369);
			//ps.setInt(1, 7369);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				for(int i=0;i<8;i++){
					System.out.print(rs.getObject(i+1)+"	");
				}
				System.out.println();
			}
			ps.close();
			cn.close();
	
	
	
	}

}
