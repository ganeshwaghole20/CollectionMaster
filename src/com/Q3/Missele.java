package com.Q3;

import java.util.Iterator;
import java.util.LinkedList;

public class Missele {

	public static void main(String[] args) {

	
	LinkedList <Integer>linklist=new LinkedList();
	linklist.add(7);
	linklist.add(1);
	linklist.add(5);
	System.out.println(linklist);

	int max=linklist.get(0);
	int min=linklist.get(0);
for(int i=0;i<linklist.size();i++)
{
	if(linklist.get(i)>max)
		max=linklist.get(i);
	if(linklist.get(i)<min)
		min=linklist.get(i);
}

boolean flag=true;


for(int j=min;j<=max;j++)
{
	flag=true;
	for(int k=0;k<linklist.size();k++)
	{
		int tmp=linklist.get(k);
		
		if(j==tmp)
		{
			flag =false;
			break;
		}
		
	}
	if(flag==true)
	{
		System.out.println(j);
	}
}

	}

}
