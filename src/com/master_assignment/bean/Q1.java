package com.master_assignment.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Q1 {

	public static void main(String[] args) { 
		HashMap<Integer, List<Stud>> studentMap = new HashMap<Integer, List<Stud>>();
		int ccid=0, tt=0;
		Set ss=studentMap.entrySet();
Iterator itr=ss.iterator();
while(itr.hasNext())
{	Map.Entry ee=(Entry)itr.next();
	int cid=(int) ee.getKey();
	ArrayList<Stud> al=(ArrayList<Stud>) ee.getValue();
	int cnt=al.size();
	if(cnt>ccid)
	{		ccid=cnt;	tt=cid;}
}		
ArrayList<Course> courseList = new ArrayList<Course>();
Iterator it=courseList.iterator();
while(it.hasNext())
{
	Course tmp=(Course) it.next();
	if(tt==tmp.courseId)
			System.out.println(tmp.course_name);			
}
	}
}
