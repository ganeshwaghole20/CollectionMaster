package com.Q13;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Stud3 {
	int sid;
	String name;

	public Stud3(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}


	public static void main(String[] args) {

		LinkedHashSet<Stud3> LinkHashmap1=new LinkedHashSet<Stud3>();
		LinkedHashSet<Stud3> LinkHashmap2=new LinkedHashSet<Stud3>();
		LinkHashmap1.add(new Stud3(101,"akshay"));
		LinkHashmap1.add(new Stud3(102,"sonia"));
		LinkHashmap1.add(new Stud3(103,"rohan"));
		LinkHashmap2.add(new Stud3(103,"samiksha"));
		LinkHashmap2.add(new Stud3(104,"ankur"));
		LinkHashmap2.add(new Stud3(105,"pallavi"));
		System.out.println(LinkHashmap1);
		System.out.println(LinkHashmap2);
		Scanner scanner1=new Scanner(System.in);
		System.out.println("enter Sid");
		int number=scanner1.nextInt();
		
		Iterator iterator1=LinkHashmap1.iterator();
		Iterator iterator2=LinkHashmap2.iterator();
		int pos1=0,pos2=0;
		while(iterator1.hasNext()||iterator2.hasNext())
		{ 
			if(iterator1.hasNext())
			{
			Stud3 stud1=(Stud3) iterator1.next();
			pos1++;
			if(stud1.sid==number)
			{
				System.out.println("position in="+pos1);
			}
			}
			if(iterator2.hasNext())
			{
				pos2++;
			Stud3 stud2=(Stud3) iterator2.next();
			
			if(stud2.sid==number)
			{
				System.out.println("position in="+pos2);
			}
			}
		
		}
	}

}
