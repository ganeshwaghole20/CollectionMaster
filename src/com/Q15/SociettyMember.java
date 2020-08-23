package com.Q15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class SociettyMember {

	int membarid;
	String Wing_Fno;
	String name;
	public SociettyMember(int membarid, String wing_Fno, String name) {
		super();
		this.membarid = membarid;
		Wing_Fno = wing_Fno;
		this.name = name;
	}
	public static void main(String[] args) {
ArrayList<SociettyMember>array_List=new ArrayList<SociettyMember>();
array_List.add(new SociettyMember(101,"A301","sonia") );
array_List.add(new SociettyMember(102,"A201","suresh") );
array_List.add(new SociettyMember(103,"A303","ankir") );
array_List.add(new SociettyMember(104,"A401","sunil") );
array_List.add(new SociettyMember(105,"A304","shuaraya") );
array_List.add(new SociettyMember(106,"A203","niti") );
		
HashMap<String,ArrayList>hashMap_1= new HashMap<String,ArrayList>();
Iterator iterator1=array_List.iterator();

	while(iterator1.hasNext())
	{
		SociettyMember society_member=(SociettyMember)iterator1.next();
		String Wing=society_member.Wing_Fno;
		Iterator iterator2=array_List.iterator();
		ArrayList<String> array_List2=new ArrayList<String>();

		while(iterator2.hasNext())
		{
			SociettyMember society_member2=(SociettyMember)iterator2.next();
			if(Wing.compareTo(society_member2.Wing_Fno)==0)
			{
				array_List2.add(society_member2.name);
			}
			
		}
		hashMap_1.put(Wing,array_List2);
	}

	System.out.println(hashMap_1);
	}

}
