package com.manage.leave;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class LeaveCalculator implements LeaveOperations{
	
	@Override
	public int totalNoOfLeaves(Date start , Date end) {
		long diffInMillis = end.getTime() - start.getTime();
	    long diffInDays = TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);
	    int numberOfLeaves = (int) diffInDays + 1;
	    System.out.println("total no. of leave :" + numberOfLeaves);
	    return numberOfLeaves;
	}
	
	public abstract boolean leaveStatusGenerator(int noOfLeaves);
	}

class LeaveStatus extends LeaveCalculator{

	@Override
	public boolean leaveStatusGenerator(int noOfLeaves) {
		if(noOfLeaves > 4) {
			return false;
		}
		else {
			return true;
		}
	}
	
}
