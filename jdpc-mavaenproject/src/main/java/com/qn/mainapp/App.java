package com.qn.mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) throws Exception
    {
     DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
   	 System.out.println("driver loaded successfully");
   	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rooman","root","Shobha@133");
   	 System.out.println("Connection established");
   	 String s="select * from student where id = ?";
   	 PreparedStatement pstmt=con.prepareStatement(s);
   	 System.out.println("please enter the id ");
   	 Scanner Sc=new Scanner(System.in);
   	 int id=Sc.nextInt();
   	 pstmt.setInt(1, id);
   	 ResultSet res=pstmt.executeQuery();
   	 if(res.next()) {
   		 id=res.getInt(1);
   		 String name=res.getString(2);
   		 int marks1=res.getInt(3);
   		 System.out.println(id +" "+name+" "+marks1);
   	 }
    }
  }

