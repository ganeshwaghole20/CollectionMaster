package com.master_assignment.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Lessresult {

	public static void main(String[] args) {

		HashMap<Integer, List<TestRes>> test_map = new HashMap<Integer, List<TestRes>>();
		ArrayList<Integer>poorStudent=new ArrayList<>();
		Set ss=test_map.entrySet();
		Iterator itr1=ss.iterator();
		while(itr1.hasNext())
		{
			Map.Entry entry1=(Entry) itr1.next(); 
			
			int cid=(Integer) entry1.getKey();
			System.out.println("course id="+cid);
			
			ArrayList<TestRes>arrayList=(ArrayList<TestRes>) entry1.getValue();
			poorStudent.clear();
			
			for(int i=0;i<arrayList.size();i++)
			{
				TestRes testResult=arrayList.get(i);
			if(	((testResult.marks/testResult.out_of_marks)*100)<40)
			{
				poorStudent.add(testResult.studentId);
			}
			}
			
			
			System.out.println(poorStudent);
			
			
		}
		
		
		
	}

}
