package com.Q16;

import java.util.Comparator;

public class SortComp implements Comparator<Stud4>{

	@Override
	public int compare(Stud4 s1, Stud4 s2) {
		// TODO Auto-generated method stub
		return s2.TotalMarks-s1.TotalMarks;
	}

}
