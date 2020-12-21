package com.facebook1.dao;

public class Facebook1DAO implements Facebook1DAOInterface{
	public int createProfile(String fname,String lname,String email,String password,String phone) {
		int i=0;
		if(fname.equals("Rajesh")) {
			i=1;
		}
		return i;
	}
}



//if a class will implement any interface then class have to write body for all the methods of that interface