package com.univ.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.univ.DB.DBconnection;
import com.univ.DTO.NewregDTO;

public class NewregDAO {
	public int insert(NewregDTO t1) { //NewReg
		int x=0;
		try {
		String qry=("insert into customerreg(Cname,Cadd,mob,email,unm,pw) values(?,?,?,?,?,?)");
		Connection con=DBconnection.getconn();
		PreparedStatement ps= con.prepareStatement(qry);
		ps.setString(1, t1.getCname());
		ps.setString(2, t1.getCadd());
		ps.setLong(3, t1.getMob());
		ps.setString(4, t1.getEmail());
		ps.setString(5, t1.getUnm());
		ps.setString(6, t1.getPw());
		x=ps.executeUpdate();		
		}
		catch(Exception t){
			System.out.println(t);
		}
   return x;
}
public int check(NewregDTO t1) { //user login
	int x=0;
	try {
		Connection con=DBconnection.getconn();
		PreparedStatement stm=con.prepareStatement("select * from customerreg where unm=? and pw=?");
		stm.setString(1, t1.getUnm());
		stm.setString(2, t1.getPw());
		ResultSet rs=stm.executeQuery();
		if(rs.next()){
		   int p= rs.getInt(8);
		   if(p==4)
			x=4;
	    }
		else
		{			
			x=1;
		}
		}
	catch(Exception tt){
		System.out.println(tt);
	}
	return x;
}
public NewregDTO search(NewregDTO t1){ //search
	NewregDTO p1=new NewregDTO();
	try {
		
		Connection con=DBconnection.getconn();
		PreparedStatement stm=con.prepareStatement("select * from customerreg where cid=? ");
		stm.setInt(1,t1.getCid());
		ResultSet rs=stm.executeQuery();
		if(rs.next()) {
			p1.setCid(rs.getInt(1));
			p1.setCname(rs.getString(2));
			p1.setCadd(rs.getString(3));
			p1.setMob(rs.getInt(4));
			p1.setEmail(rs.getString(5));
			p1.setUnm(rs.getString(6));
		}
		else {
			p1=null;
		}
	}
	catch(Exception tt){
		System.out.println(tt);
	}
	return p1;
}
}