package com.Q4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Stud6 {
	
	
	int sid;
	String name;
	String course; 
	
	public Stud6(int sid, String name, String course) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
	}

	public static void main(String[] args) {

		HashMap<Stud6,Integer>hashmap1=new HashMap<Stud6,Integer>();
		hashmap1.put(new Stud6(104,"rohit","java"),40);
		hashmap1.put(new Stud6(105,"hardik","angular"),70);
		hashmap1.put(new Stud6(106,"akshay","angular"),50);
		hashmap1.put(new Stud6(101,"rohan","java"),30);
		hashmap1.put(new Stud6(102,"shikhar","angular"),70);
		hashmap1.put(new Stud6(103,"ronak","java"),60);
		
		System.out.println(hashmap1);
		HashSet<Stud6>hsetpassjava=new HashSet();
		HashSet<Stud6>hsetpassangular=new HashSet();
		
		Set set1=hashmap1.entrySet();
		Iterator iterator1=set1.iterator();
		while(iterator1.hasNext())
		{
			Map.Entry entry=(Entry)iterator1.next();
			Stud6 stud1=(Stud6)entry.getKey();
			int number=(int)entry.getValue();
			if((stud1.course.compareTo("java")==0)&&number>=50)
			{
				hsetpassjava.add(stud1);
			}
			else if((stud1.course.compareTo("angular")==0)&&number>=60)
			{
				hsetpassangular.add(stud1);
			}
			
		}
		System.out.println(hsetpassjava);
		System.out.println(hsetpassangular);
		
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", course=" + course + "]";
	}

}
