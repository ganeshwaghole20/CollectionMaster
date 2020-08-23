package com.Q16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Stud4 implements Comparable<Stud4>  {

	int sid;
	int TotalMarks;
	
	public Stud4(int sid, int totalMarks) {
		super();
		this.sid = sid;
		TotalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", TotalMarks=" + TotalMarks + "]";
	}

	public static void main(String[] args) {

		//  an ArrayList<Test>and test has {tid,sid,int marks[]} .Create a
		// Set<Student> Student{sid,totalmarks} from the list and sort the set in
		// descending order of totalmarks
		
	ArrayList<Test2>array_list=new ArrayList<Test2>();
	array_list.add(new Test2(11,101,new int[] {10,30,40}));
	array_list.add(new Test2(22,102,new int[] {30,20,50}));
	array_list.add(new Test2(33,103,new int[] {40,30,50}));
	array_list.add(new Test2(44,104,new int[] {70,30,60}));
	array_list.add(new Test2(55,105,new int[] {50,60,50}));

	Set<Stud4> sset=new HashSet();
Iterator iterator_1=array_list.iterator();
while(iterator_1.hasNext())
{
	Test2 test=(Test2)iterator_1.next();
	
	int ssid=test.sid;
	int [] arr=test.marks;
	int total=0;
	for(int i=0;i<arr.length;i++)
	{
		total=total+arr[i];
	}
	sset.add(new Stud4(ssid,total));
	
}

	
System.out.println(sset);	
ArrayList<Stud4>arraylistf =new ArrayList<Stud4>(sset);

Collections.sort(arraylistf);
System.out.println(arraylistf);
	}

	@Override
	public int compareTo(Stud4 o) {
		// TODO Auto-generated method stub
		return this.TotalMarks-o.TotalMarks;
	}



}
