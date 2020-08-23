package com.Q6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Stud7 {

	int rollno;
	String name;
	int marks;
	
	public Stud7(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public static void main(String[] args) {

		HashSet<Stud7>hashset1=new HashSet<Stud7>();
		hashset1.add(new Stud7(103,"sonia",75));
		hashset1.add(new Stud7(104,"ankit",65));
		hashset1.add(new Stud7(105,"sumit",85));
		hashset1.add(new Stud7(101,"rohan",85));
		hashset1.add(new Stud7(102,"nayan",75));
		
		HashMap<Integer,ArrayList<Integer>>hashmap1=new HashMap<Integer,ArrayList<Integer>>();
		
		
		Iterator iterator1=hashset1.iterator();
		while(iterator1.hasNext())
		{
			Stud7 stud1=(Stud7) iterator1.next();
	
			Iterator iterator2=hashset1.iterator();
			ArrayList<Integer>arraylist1=new ArrayList<Integer>();
			while(iterator2.hasNext())
			{
				
				Stud7 stud2=(Stud7) iterator2.next();
				if(stud1.marks==stud2.marks)
				{
				arraylist1.add(stud2.rollno);	
				}
			}
			hashmap1.put(stud1.marks,arraylist1);
			
		}
		
System.out.println(hashmap1);
	}
	

}
