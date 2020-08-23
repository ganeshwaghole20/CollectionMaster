package com.Q11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ord {

	int ordid;
	String menuName;
	float price;
	int QtyOrd;
	
	public Ord(int ordid, String menuName, float price, int qtyOrd) {
		super();
		this.ordid = ordid;
		this.menuName = menuName;
		this.price = price;
		QtyOrd = qtyOrd;
	}

	public static void main(String[] args) {
HashMap <String ,Float>hashmap1=new HashMap <String ,Float>();

	ArrayList<Ord>arraylist=new ArrayList<Ord>();
	arraylist.add(new Ord(101,"Vadapav",5.00f,10));
	arraylist.add(new Ord(102,"Pabhaji",14.00f,3));
	arraylist.add(new Ord(103,"Hakkanoodeld",25.00f,5));
	arraylist.add(new Ord(104,"sandwhich",35.00f,2));
	arraylist.add(new Ord(105,"Vadapav",5.00f,05));
	
	Iterator iterator1=arraylist.iterator();
	while(iterator1.hasNext())
	{
		Ord o=(Ord) iterator1.next();
		String string1=o.menuName;
		int sum=0;
		Iterator iterator2=arraylist.iterator();
		while(iterator2.hasNext())
		{
			Ord o2=(Ord) iterator2.next();
		if(string1.equals(o2.menuName))
{
  sum=(int) (sum+(o2.price*o2.QtyOrd));
}
				
		}
		hashmap1.put(string1, (float) sum);
		
	}
	System.out.println(hashmap1);
	}

}
