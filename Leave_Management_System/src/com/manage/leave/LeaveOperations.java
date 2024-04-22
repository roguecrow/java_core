package com.manage.leave;

import java.util.Date;

public interface LeaveOperations {
	int totalNoOfLeaves(Date start, Date end);
	boolean leaveStatusGenerator(int noOfLeaves);
}
