package com.manage.leave;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class FileGenerator {
	
	void fileCreater() {
		 try {   
			    File f0 = new File("C:\\Users\\babu3560\\eclipse-workspace\\Leave_Management_System\\leave_Data.txt"); 
            if (f0.createNewFile()) {  
                       System.out.println("File " + f0.getName() + " is created successfully.");  
            } 
            else {  
                       System.out.println("File is already exist in the directory.");  
            }  
          } catch (IOException exception) {  
                   System.out.println("An unexpected error is occurred.");  
                   exception.printStackTrace();  
       }      
	}
}
public class LeaveDataSaver {
	
	void fileWriter(LeaveDetails details,int totalLeaves) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String data = details.getEmployeeId() + "," +
                details.getRequestId() + "," +
                details.getLeaveType() + "," +
                dateFormat.format(details.getStartDate()) + "," +
                dateFormat.format(details.getEndDate()) + "," +
                totalLeaves + "," + details.isStatus() + "\n";

		 try {  
		        FileWriter fwrite = new FileWriter("C:\\Users\\babu3560\\eclipse-workspace\\Leave_Management_System\\leave_Data.txt",true);  
		        // writing the content into the FileOperationExample.txt file  
		        fwrite.write(data);   
		   
		        // Closing the stream  
		        fwrite.close();   
		        System.out.println("Leave details stored to file.");  
		    } catch (IOException e) {  
		        System.out.println("Unexpected error occurred");  
		        e.printStackTrace();  
		        }  
	}
	
	int fileReader(LeaveDetails details) {
		int totalLeaves = 0;
		try {  
            // Create f1 object of the file to read data  
            File f1 = new File("C:\\Users\\babu3560\\eclipse-workspace\\Leave_Management_System\\leave_Data.txt");    
            Scanner dataReader = new Scanner(f1);
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();
                String [] fields = fileData.split(",");
                String id = fields[0];
                if(id.equals(details.getEmployeeId())) {
                	totalLeaves += Integer.parseInt(fields[5]);
                }
                //System.out.println(fileData);  
            }  
            dataReader.close();  
        } catch (FileNotFoundException exception) {  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace();  
        }
		return totalLeaves;
	}
}
