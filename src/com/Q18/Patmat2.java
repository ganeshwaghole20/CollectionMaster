package com.Q18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Patmat2 {
	static HashMap<String,Integer>hashmap1=new HashMap<String, Integer>();

	public static void main(String[] args) {

	
		ArrayList<String>arrayList1=new ArrayList<String>();
		arrayList1.add("DD+5");
		arrayList1.add("B+12");
		arrayList1.add("A+2");
		arrayList1.add("D+4");
		
		Iterator iterator1=arrayList1.iterator();
		
		while(iterator1.hasNext())
		{
			String inutString=(String)iterator1.next();
			String StrArray[]=inutString.split("\\+");
			Integer n=Integer.parseInt(StrArray[1]);
			hashmap1.put(StrArray[0], n);
			
		}
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter char or String");
		String inutString=scanner.next();
		System.out.println(find(inutString));
	}
	public static int find(String inutString)
	{
		Set set1=hashmap1.entrySet();
		Iterator iterator1=set1.iterator();
		while(iterator1.hasNext())
		{
			Map.Entry entry=(Entry)iterator1.next();
			String temp_String=(String)entry.getKey();
			if(temp_String.compareTo(inutString)==0)
			{
				return (int) entry.getValue();
			}
			
			
		}
		
		return 0;
	}

}
