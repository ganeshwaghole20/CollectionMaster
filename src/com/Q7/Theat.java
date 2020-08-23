package com.Q7;

import java.util.ArrayList;
import java.util.Collections;

public class Theat  {	

	int theatreId;
	 String theatreName;
	String location;
	Movi m;
	public Theat(int theatreId, String theatreName, String location, Movi m) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.location = location;
		this.m = m;
		
		
	}
@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", location=" + location + ", m="
				+ m + "]";
	}
public static void main(String[] args) {
	
	ArrayList<Theat> arraylist1=new ArrayList<Theat>();
	arraylist1.add(new Theat(3,"Big Cinema","pimrp",new Movi(1004,"race",2)));
	arraylist1.add(new Theat(4,"inox","cinchwad",new Movi(1004,"DDLj",5)));
	arraylist1.add(new Theat(5,"inox","cinchwad",new Movi(1005,"saamy2",3)));
	arraylist1.add(new Theat(1,"PVR","cinchwad",new Movi(1001,"dhoom",4)));
	arraylist1.add(new Theat(2,"inorbit","kharadi",new Movi(1002,"saamy2",4)));
	
	System.out.println(arraylist1);
	Collections.sort(arraylist1,new MratComp());
	System.out.println(arraylist1);
	
	
}	
}
