package com.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

	public List<User> getAllUsers() {
		List<User> ulist = new ArrayList<>();
		String sql = "select * from user";
		
		Statement stm;
		try {
			stm = DB.getConnection().createStatement();
			ResultSet rs = stm.executeQuery(sql);
		

		
	
			while(rs.next()) {
				
				//row mapping to object
				
				User user = new User();
				
				user.setId(rs.getInt("id"));
				user.setFname(rs.getString("fname"));
				user.setLname(rs.getString("lname"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				
				ulist.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ulist;
	}
		
}
