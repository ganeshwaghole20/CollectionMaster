package com.master_assignment.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Academy {
//	show student result for
//	course id
//	and test
//	id sorted
//	from topper
//	to lowest
//	marks.If student
//	marks are
//	equal sort
//	on their names

	// arraylist object course
	public static ArrayList<Course> courseList = new ArrayList<Course>();

	// create map object for student - key = course id
	// ONE STUDENT ONE COURSE
	public static HashMap<Integer, List<Stud>> studentMap = new HashMap<Integer, List<Stud>>();

	// create map object for attendance - key = course id
	public static HashMap<Integer, List<Attendance>> attendanceMap = new HashMap<Integer, List<Attendance>>();

	// create map object for testresult - key = course id
	public static HashMap<Integer, List<TestRes>> test_map = new HashMap<Integer, List<TestRes>>();

	// create map object for transaction - key = course id
	// NOTE ONE STUDENT CAN PAY FEES MANY TIME FOR SAME COURSE
	// EG courseId 1 fees is 10k, then in this map for one stud 2 entry can also
	// be there. Eg 5k one time, 5k another time
	public static HashMap<Integer, List<Transaction>> transactionMap = new HashMap<Integer, List<Transaction>>();

}
