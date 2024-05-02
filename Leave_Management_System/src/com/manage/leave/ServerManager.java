package com.manage.leave;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ServerManager {
	 ConnectionUtil connection;
     Connection connect;

    public ServerManager() throws ClassNotFoundException, SQLException {
        connection = new ConnectionUtil();
        connect = connection.getConnection();
    }
	void insertValues(LeaveDetails details) throws ClassNotFoundException, SQLException {
	    String addEmployee = "INSERT INTO leave_details (emp_id, request_id, start_date, end_date, leave_type, status, username) "
	               + "VALUES (?, ?, ?, ?, ?, ?, ?)";
	    PreparedStatement prepareStatement = connect.prepareStatement(addEmployee);
	    prepareStatement.setInt(1, Integer.parseInt(details.getEmployeeId()));
	    prepareStatement.setString(2, details.getRequestId());
	    prepareStatement.setDate(3, new java.sql.Date(details.getStartDate().getTime()));
	    prepareStatement.setDate(4, new java.sql.Date(details.getEndDate().getTime()));
	    prepareStatement.setString(5, details.getLeaveType());
	    prepareStatement.setBoolean(6, details.isStatus());
	    prepareStatement.setString(7, details.getUsername());
	    int rows = prepareStatement.executeUpdate();
	    System.out.println("affected row :" + rows);
	    if(rows == 1) {
			System.out.println("Successfully Created account");
		}
		else {
			System.out.println("failed to creeate \nplease try again later !!!");
		}
	}

	
	void readvalues(String empId) throws SQLException, ClassNotFoundException {
		
		String empLeaves = "select * from leave_details where emp_id ="+Integer.parseInt(empId);
		PreparedStatement prepareStatement = connect.prepareStatement(empLeaves);
	    //prepareStatement.setInt(1, Integer.parseInt(details.getEmployeeId()));
		ResultSet rows = prepareStatement.executeQuery();
		
		ResultSetMetaData metaData = rows.getMetaData();
        int columnCount = metaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            System.out.print(metaData.getColumnName(i) + "   ");
        }
        System.out.println();

        while (rows.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rows.getString(i) + "    ");
            }
            System.out.println();
        }
	}
	
	void updateValues(LeaveDetails details) throws ClassNotFoundException, SQLException {
	    String updateUsername = "UPDATE leave_details SET username = '" + details.getUsername() + "' WHERE emp_id = " + Integer.parseInt(details.getEmployeeId());
		PreparedStatement prepareStatement = connect.prepareStatement(updateUsername);
		int rows = prepareStatement.executeUpdate();
		System.out.println(rows);
		if(rows != 0) {
			System.out.println("Successfully Updated");
		}
		else {
			System.out.println("failed to Updated");
		}
		
	}
	
	void removeValues(LeaveDetails details) throws ClassNotFoundException, SQLException {
		String deleteUser = "DELETE from leave_details where emp_id = "+details.getEmployeeId();
		PreparedStatement prepareStatement = connect.prepareStatement(deleteUser);
		int rows = prepareStatement.executeUpdate();
		System.out.println(rows);
		if(rows == 1) {
			System.out.println("Successfully deleted");
		}
		else {
			System.out.println("failed to delete");
		}
	}
	boolean findID(LeaveDetails details,String id) throws ClassNotFoundException, SQLException {
		String findUser = "SELECT emp_id,username FROM leave_details WHERE emp_id = ?";
	    PreparedStatement prepareStatement = connect.prepareStatement(findUser);
	    prepareStatement.setInt(1, Integer.parseInt(id));
	    ResultSet resultSet = prepareStatement.executeQuery();
	    
	    if (resultSet.next()) {
	        int count = resultSet.getInt(1);
	        int empId = resultSet.getInt("emp_id");
	        String userName= resultSet.getString("username");
	        details.setEmployeeId(Integer.toString(empId));
	        details.setUsername(userName);
	        System.out.println("found record :"+count);
	        return count > 0;
	    }
	    return false;
	}

}

