package com.manage.leave;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ServerManager {
	
	void insertValues(Connection connect) throws ClassNotFoundException, SQLException {
		
		
		String query = "insert into leave_details (emp_id, request_id, start_date, end_date, leave_type, status) "
				       + "values (1, 'REQ001', '2024-05-01', '2024-05-05', 'Vacation', 1)";
		PreparedStatement prepareStatement = connect.prepareStatement(query);
		int rows = prepareStatement.executeUpdate(query);
		System.out.println("affected row :" + rows);
	}
	
	void readvalues(Connection connect) throws SQLException, ClassNotFoundException {
		
		String query = "select * from leave_details";
		PreparedStatement prepareStatement = connect.prepareStatement(query);
		ResultSet rows = prepareStatement.executeQuery();
		
		ResultSetMetaData metaData = rows.getMetaData();
        int columnCount = metaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            System.out.print(metaData.getColumnName(i) + "\t");
        }
        System.out.println();

        while (rows.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rows.getString(i) + "\t");
            }
            System.out.println();
        }
	}
	
	void updateValues(Connection connect) throws ClassNotFoundException, SQLException {
		String query = "UPDATE leave_details set status = 0 where emp_id = 1";
		PreparedStatement prepareStatement = connect.prepareStatement(query);
		int rows = prepareStatement.executeUpdate();
		System.out.println(rows);
		
	}
	
	void removeValues(Connection connect) throws ClassNotFoundException, SQLException {
		String query = "DELETE from leave_details where emp_id = 1 and request_id = 'REQ001'";
		PreparedStatement prepareStatement = connect.prepareStatement(query);
		int rows = prepareStatement.executeUpdate();
		System.out.println(rows);
	}

}

