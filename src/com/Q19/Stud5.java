package com.Q19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Stud5 {
int studid;
String name;
String Qualification;
int YearOfPassing;
boolean placed;
	
	
	
	@Override
public String toString() {
	return "Student [studid=" + studid + ", name=" + name + ", Qualification=" + Qualification + ", YearOfPassing="
			+ YearOfPassing + ", placed=" + placed + "]";
}



	public Stud5(int studid, String name, String qualification, int yearOfPassing, boolean placed) {
	super();
	this.studid = studid;
	this.name = name;
	Qualification = qualification;
	YearOfPassing = yearOfPassing;
	this.placed = placed;
}



	public static void main(String[] args) {

		HashSet <Stud5> hashSet1=new HashSet <Stud5>();
		
		hashSet1.add(new Stud5(4,"sonia","BE",2017,false));
		hashSet1.add(new Stud5(5,"akshay","MBA",2015,true));
		hashSet1.add(new Stud5(1,"sammmer","BCA",2019,true));
		hashSet1.add(new Stud5(2,"ronak","MCA",2020,false));
		hashSet1.add(new Stud5(3,"Yash","BE",2018,true));
		
		
		ArrayList<Stud5>placedstudlist=new ArrayList<Stud5>();
		ArrayList<Stud5>unplacedstudlist=new ArrayList<Stud5>();
		
		Iterator iterator1=hashSet1.iterator();
		while(iterator1.hasNext())
		{
			Stud5 stud1=(Stud5)iterator1.next();
			if(stud1.placed)
			{
				placedstudlist.add(stud1);
			}
			else
			{
				unplacedstudlist.add(stud1);
			}
			
		}
		
	
	System.out.println("placed Student");
	System.out.println(placedstudlist);
	
	System.out.println("unplaced Student");
	System.out.println(unplacedstudlist);
	
	}

}
