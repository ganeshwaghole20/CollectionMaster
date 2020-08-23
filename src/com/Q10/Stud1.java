package com.Q10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Stud1 {

	int sid;
String sname;

	@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + "]";
}
	public Stud1(int sid, String sname) {
	super();
	this.sid = sid;
	this.sname = sname;
}
	public static void main(String[] args) {
		HashMap<Stud1,ArrayList<Cour>>hmap=new HashMap<Stud1,ArrayList<Cour>>(); 
		hmap.put(new Stud1(101,"ankit"),new ArrayList<Cour>(Arrays.asList(new Cour(1,".net"),new Cour(2,"angu")) ));
		hmap.put(new Stud1(102,"somia"),new ArrayList<Cour>(Arrays.asList(new Cour(1,"java"),new Cour(3,"paythn")) ));
		hmap.put(new Stud1(103,"rohan"),new ArrayList<Cour>(Arrays.asList(new Cour(1,"js"),new Cour(4,"noSQL")) ));
		hmap.put(new Stud1(104,"akshay"),new ArrayList<Cour>(Arrays.asList(new Cour(4,"mongodb"),new Cour(2,"react")) ));
		
		System.out.println(hmap);
		Set <Integer>hset=new  LinkedHashSet<Integer>();
		
		Set ss=hmap.entrySet();
	Iterator itr1=ss.iterator();
	while(itr1.hasNext())
	{
		Map.Entry ee=(Entry) itr1.next();
		ArrayList<Cour>al=(ArrayList<Cour>) ee.getValue();
		Iterator itral=al.iterator();
		while(itral.hasNext())
		{
			Cour c=(Cour) itral.next();
			hset.add(c.cid);
		}
		
	}
		System.out.println(hset);
		HashMap<Integer,ArrayList<Stud1>>hmapIstud= new HashMap<Integer,ArrayList<Stud1>>();
		ArrayList<Stud1>finalal=new ArrayList<Stud1>();
		
			Iterator hsetitr=hset.iterator();
			while(hsetitr.hasNext())
			{
				int tno=(int) hsetitr.next();
				Set ss2=hmap.entrySet();
				Iterator itrhmap2=ss2.iterator();
	
				while(itrhmap2.hasNext())
				{
					Map.Entry mm=(Entry) itrhmap2.next();
					Stud1 stud1=(Stud1)mm.getKey();
					ArrayList<Cour>al=(ArrayList<Cour>) mm.getValue();
					Iterator itral=al.iterator();
						while(itral.hasNext())
					{
						Cour c=(Cour) itral.next();
						int ccid=c.cid;
					if(ccid==tno) {
						finalal.add(stud1);
					                   }	
					}
						System.out.println(finalal);

			}
				hmapIstud.put(tno,finalal);
				finalal.clear();
			
		}
			System.out.println(hmapIstud);
		
	}

}
