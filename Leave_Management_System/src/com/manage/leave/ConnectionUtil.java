package com.manage.leave;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ConnectionUtil {
	public static void main(String arg[]) throws ClassNotFoundException, SQLException {
		DataSaver saver = new DataSaver();
		ConnectionUtil connection = new ConnectionUtil();
		Connection connect = connection.getConnection();
		saver.readvalues(connect);
        //saver.insertValues(connect);
		//saver.updateValues(connect);
		//saver.removeValues(connect);
	}
	public  Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/leave_management_system","root","12345678");
		return connection;	
	}
}


//public class StudentImpl {
//
//    public static void main(String args[]) throws ClassNotFoundException, SQLException {
//        StudentImpl stud1=new StudentImpl();
//        Student student1=new Student(98, "Prabhu", 7);
//       // stud1.insertStudent(student1);
////stud1.insertStudent(student1);
//        stud1.save();
//    }
//    public void insertStudent(Student student) throws ClassNotFoundException, SQLException
//    {
//        Connection connection = ConnectUtil.getConnection();
//        System.out.println(connection);
//        String save="insert into student (name, grade) values ('Prabhu', 7)";
//        PreparedStatement prepareStatement = connection.prepareStatement(save);
//        int rows = prepareStatement.executeUpdate();
//        System.out.println(rows+"inserted");
//       
//    }
//
//public void save() throws ClassNotFoundException, SQLException
//    {
//        Student student =new Student();
//        Connection connection = ConnectUtil.getConnection();
//        System.out.println(connection);
//        String save="insert into student (name, grade) values ('Prabhuram', 7)";
//        PreparedStatement prepareStatement = connection.prepareStatement(save);
//        int rows = prepareStatement.executeUpdate();
//        System.out.println(rows+"inserted");
//           
//    }
//}