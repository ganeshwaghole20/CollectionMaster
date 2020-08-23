package com.Q7;

import java.util.Collections;
import java.util.Comparator;

public class MratComp implements Comparator<Theat> {

	@Override
	public int compare(Theat theatre1y, Theat theatre2) {

		int number= theatre1y.m.rating-theatre2.m.rating;
		if(number==0)
		{
return theatre2.theatreName.compareTo(theatre1y.theatreName);
		}
		
		return theatre1y.m.rating-theatre2.m.rating;
	}

}
