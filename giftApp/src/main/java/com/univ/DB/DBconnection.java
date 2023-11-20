package com.univ.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection implements DBconfig{
 static Connection con;
 public static Connection getconn(){
	 try {
		 Class.forName(Driver);
		 con=DriverManager.getConnection(Conn, unm, pw);
	 }
	 catch(Exception tt){
		 System.out.println(tt);
	 }
	return con;
 }
}
