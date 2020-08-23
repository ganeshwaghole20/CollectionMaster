package com.Q5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Cust12  implements Comparable<Cust12>{

	int cid;
	String name;
	int items;
		public Cust12(int cid, String name, int items) {
		super();
		this.cid = cid;
		this.name = name;
		this.items = items;
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<Cust12>arraylist1=new ArrayList<Cust12>();
arraylist1.add(new Cust12(103,"sonia",7));
arraylist1.add(new Cust12(101,"seema",1));
arraylist1.add(new Cust12(101,"rima",3));
arraylist1.add(new Cust12(102,"aksay",2));

System.out.println(arraylist1);
for(int i=0;i<arraylist1.size();i++)
{
	int  ccid=arraylist1.get(i).cid;
	String nname=arraylist1.get(i).name;
			int items=arraylist1.get(i).items;
		
		
		for(int k=i+1;k<arraylist1.size();k++)
		{
			int kcid=arraylist1.get(k).cid;
			if(kcid==ccid)
			{
				int temp2=items+arraylist1.get(k).items;
				
				arraylist1.get(i).items=temp2;
				
			}
			
		}
}
System.out.println(arraylist1);
Collections.sort(arraylist1);
System.out.println(arraylist1);

	}
		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", name=" + name + ", items=" + items + "]";
		}
		@Override
		public int compareTo(Cust12 o) {
			// TODO Auto-generated method stub
			return o.items-this.items;
		}

}
