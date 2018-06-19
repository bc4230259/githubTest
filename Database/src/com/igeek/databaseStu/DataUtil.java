package com.igeek.databaseStu;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public 	 class DataUtil implements Serializable  {
	
	private Connection cn;
	public DataUtil() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=123456");
	}
	public Boolean update(String sql,Object[] parameters) throws Exception{
		PreparedStatement ps =cn.prepareStatement(sql);
		if(parameters!=null){
			for (int i = 0; i < parameters.length; i++) {
				ps.setObject(i+1, parameters[i]);
			}
			}
			int flg=ps.executeUpdate();
			ps.close();
			if(flg>0){
				return true;
			}else{
				return false;
			}
			
	}

	public <T> List<T> search(String sql,Object[] parameters,Class<T> resultClass) throws Exception{
		PreparedStatement ps =cn.prepareStatement(sql);
		if(parameters!=null){
		for (int i = 0; i < parameters.length; i++) {
			ps.setObject(i+1, parameters[i]);
		}
		}
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rsmd=rs.getMetaData();
		
		List<T> results=new ArrayList<T>();
		while(rs.next()){
			T obj=resultClass.newInstance();
			for (int i = 0; i < rsmd.getColumnCount(); i++) {
				Field f=resultClass.getDeclaredField(rsmd.getColumnName(i+1));	
				f.setAccessible(true);
				f.set(obj, rs.getObject(i+1));
			}
				
			results.add(obj);
		}
		rs.close();
		ps.close();
		return results ;
	} 
	public void close() throws Exception{
		cn.close();
	}
	
}
