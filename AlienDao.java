package com.rizul.web.dao;
import java.sql.*;

import com.rizul.web.Alien;

public class AlienDao {
	
	public Alien getAlien(int aid)
	{
		Alien a = new Alien();
		a.setAid(101);
		a.setAname("Rizul");
		a.setTech("Java");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "Rizuzl@123");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from where alien=" + aid);
			if(rs.next())
			{
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return a;
	}

}
