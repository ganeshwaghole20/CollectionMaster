package com.Q8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Stud9 {

	int sid;
	String sname;
	ArrayList <String>Hobby;
	
	public Stud9(int sid, String sname, ArrayList<String> hobby) {
		super();
		this.sid = sid;
		this.sname = sname;
		Hobby = hobby;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", Hobby=" + Hobby + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stud9 studArray[]=new Stud9[4];
    studArray[0]= new Stud9(102,"akshay", new ArrayList<String>(Arrays.asList("read","chess")));
    studArray[1]= new Stud9(103,"rohan", new ArrayList<String>(Arrays.asList("football","chess")));
    studArray[2]= new Stud9(104,"soniya", new ArrayList<String>(Arrays.asList("cricket","read")));
    studArray[3]= new Stud9(10,"seema", new ArrayList<String>(Arrays.asList("read","chess")));
	HashSet<String>hashset1=new HashSet<String>();
	for(int i=0;i<studArray.length;i++)
	{
		Stud9 stud1=studArray[i];
		ArrayList<String>hobbi=stud1.Hobby;

		for(int j=0;j<hobbi.size();j++)
		{
			hashset1.add(hobbi.get(j));
		}
		
	}
	HashMap<String,ArrayList<Stud9>>hashmap=new HashMap<String,ArrayList<Stud9>>();
	
	Iterator itr=hashset1.iterator();
	while(itr.hasNext())
	{
		
		String hsethobby =(String) itr.next();
		ArrayList<Stud9>hobby1=new ArrayList<Stud9>();
		hobby1.clear();
		for(int i=0;i<studArray.length;i++)
		{
			Stud9 stud1=studArray[i];
			ArrayList<String>hobbi=stud1.Hobby;
			for(int j=0;j<hobbi.size();j++)
			{
				
				if(hsethobby.equals(hobbi.get(j)))
						{
					hobby1.add(stud1);
					break;
						}
			}
			
		}
		hashmap.put(hsethobby,hobby1);
		//
	}
	System.out.println(hashmap);
	
	
	}

}
