package com.manage.leave;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class LeaveInfo {
	
	static void getLeaveDetails(LeaveDetails details,LeaveStatus status) {
		String[] leaveType = new String[]{"Medical Leave", "Personal Leave"};
		InfoValidator val = new InfoValidator();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
		System.out.println("Enter Employee ID :");
		details.setEmployeeId(val.validator(1));
		while (true) {
			System.out.println("Enter Leave start date(dd/mm/yyyy) :");
			try {
				details.setStartDate(sdf.parse(val.validator(4)));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Enter Leave End date(dd/mm/yyyy) :");
			try {
				details.setEndDate(sdf.parse(val.validator(4)));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int leave = status.totalNoOfLeaves(details.startDate, details.endDate);
			if(leave > 0) {
				break;
			}
			else {
				System.out.println("Enter a valid date ...");
			}
		}

			System.out.println("leave Type :");
			for(int i = 0;i<leaveType.length;i++) {
				System.out.println(i+1+" " + leaveType[i]);
			}
			int num = Integer.parseInt(val.validator(1));
			switch(num) {
			case 1 :
				details.setLeaveType(leaveType[num - 1]);
				break;
			case 2 :
				details.setLeaveType(leaveType[num - 1]);
				break;
			}
			details.setRequestId(requestIDGenerator());
	}
	
	static String requestIDGenerator() {
		Random random = new Random();
		long requestID =  random.nextLong(999L,9999L);
		return "111"+Long.toString(requestID);
	}
	
	static void printLeaveDetails(LeaveDetails details) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String date = simpleDateFormat.format(details.getStartDate());
		System.out.println("Employee ID :" + details.getEmployeeId()+
	             "\nYour Request ID : "+ details.getRequestId() +
	             "\nleave Type : "+details.getLeaveType()+"\nstartDate :" +date);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeaveDetails details = new LeaveDetails();
		LeaveStatus status = new LeaveStatus();
		getLeaveDetails(details,status);
		int totalLeave = status.totalNoOfLeaves(details.startDate, details.endDate);
		 System.out.println("total no. of leave :" + totalLeave);
		String leaveMessage = status.leaveStatusGenerator(totalLeave) ? 
				"You can take leave for " + totalLeave + " days" : 
					"You are not eligible for "+ totalLeave + " days leaves";
		System.out.println(leaveMessage);
		printLeaveDetails(details);
	}

}
