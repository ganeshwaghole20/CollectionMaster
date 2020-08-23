package com.Q9;

import java.util.ArrayList;

public class Emp12 {

	String name;
	int eid;
	int mgrid;
	public Emp12(String name, int eid, int mgrid) {
		super();
		this.name = name;
		this.eid = eid;
		this.mgrid = mgrid;
	}
	public static void main(String[] args) {
ArrayList<Emp12>arraylist=new ArrayList<Emp12>();
arraylist.add(new Emp12("amit",101,105));
arraylist.add(new Emp12("sameer",105,104));
arraylist.add(new Emp12("akshay",102,103));
arraylist.add(new Emp12("rohan",103,102));
arraylist.add(new Emp12("amol",104,101));

	
	for(int i=0;i<arraylist.size();i++)
	{
		Emp12 employee1=arraylist.get(i);
		int empID=employee1.eid;
		int mngrId=employee1.mgrid;
		 for(int j=0;j<arraylist.size();j++)
		 {
			 Emp12 employee2=arraylist.get(j);
			 if(mngrId==employee2.eid)
			 {
				 System.out.println(employee1.name+" "+employee2.name);
			 }
		 }
	}
	
	
	
	
	}

}
