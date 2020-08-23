package com.Q20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Playr {
int playerid;
String Name;
String Country;
String Team;


@Override
public String toString() {
	return "Player [playerid=" + playerid + ", Name=" + Name + ", Country=" + Country + ", Team=" + Team + "]";
}

	public Playr(int playerid, String name, String country, String team) {
	super();
	this.playerid = playerid;
	Name = name;
	Country = country;
	Team = team;
	
	
	
	
	
}




	




	public static void main(String[] args) {
		ArrayList <Playr>arraylist=new ArrayList<Playr>();
		arraylist.add(new Playr(105,"akshay ","Australia","Mumbai Indian"));
		arraylist.add(new Playr(106,"rahul","Australia","Chennai Super King"));
		arraylist.add(new Playr(107,"rohit","Australia","Mumbai Indian"));
		arraylist.add(new Playr(108,"Shane","Australia","kolkata knight rider"));
		arraylist.add(new Playr(101,"Dhoni","India","Chennai Super King"));
		arraylist.add(new Playr(102,"Smith","Australia","Mumbai Indian"));
		arraylist.add(new Playr(103,"raina","India","Chennai Super King"));
		arraylist.add(new Playr(104,"dinesh","Australia","kolkata knight rider"));
		
		
		

		Iterator itrarraylist=arraylist.iterator();
		
		String string1="";
		int fcntemp=0;
		while(itrarraylist.hasNext())
		{
			Playr player1=(Playr)itrarraylist.next();
			
			String tname=player1.Team;
			Iterator itr=arraylist.iterator();
			int cnt=0;
			while(itr.hasNext())
			{
				Playr p1=(Playr)itr.next();
			if (p1.Country.compareTo("Australia")==0 &&tname.compareTo(p1.Team)==0)
			{
				cnt++;
			}
							
				
			}
			if(cnt>fcntemp)
			{
				fcntemp=cnt;
				string1=player1.Team;
			}
			
		}		
		
		System.out.println(string1);
		
	}
}

