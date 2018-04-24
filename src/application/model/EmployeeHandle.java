package application.model;
import java.io.*;
public class EmployeeHandle {

	private static final String EMPFILE = "employeeinfo.txt";
	//private Employee employee = null;
	private String empId = null;
	private String password = null;
	
	public EmployeeHandle(String empId, String password) {
		this.empId = empId;
		this.password = password;
	}
	
	/**
	 * 
	 * @return 
	 */
	public int empExist() {
		BufferedReader filein = null;
		String line;
		int result = 0;
		
		try {
			
			filein = new BufferedReader(new FileReader(EMPFILE));
			
			while((line = filein.readLine()) != null) {
				String info[] = line.split(":");
				
				// if the empId of EmployeeHandle matches the first token of the line
				if (info[0].equals(empId)) {
					
					// if the password of EmployeeHandle matches the second token
					if (info[1].equals(password)) {
						result = Integer.parseInt(info[3]);
						break;
					} 
					// if the credentials don't match
					else if (info[1].equals(password) == false) {
						result = -2;
						break;
					}
				}
				
			}
			
			// Cannot find any credentials
			if (line == null)
				result = -1;
			filein.close();
			
		} catch (Exception e){
			e.printStackTrace();
		} 
		
		return result;
	}
	/**
	 * returnEmp() returns an employee based on the given
	 * username and password.
	 * 
	 * @return Employee;
	 */
	
	/*
	public Employee returnEmp() {
		int result = this.empExist();
		if (result < 0) {
			
		}
	}
	*/
	
}
