package com.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.DB;
import com.model.User;

public class UserServiceImpl implements UserService {

	@Override
	public void userSignup(User user) {
		String sql = "insert into user (fname,lname,username,password)values('"+user.getFname()+"','"+user.getLname()+"','"+user.getUsername()+"','"+user.getPassword()+"')";
		try {
			Statement st = DB.getConnection().createStatement();
			st.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public boolean userLogin(String un, String pw) {
		// TODO Auto-generated method stub
		
		String sql = "select * from user where username='"+un+"','"+pw+"'";
		try {
			Statement st = DB.getConnection().createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
		
}
