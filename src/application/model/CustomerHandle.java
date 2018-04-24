package application.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CustomerHandle {

	public static final String CUSTFILE = "customerinfo.txt";

	/**
	 * custExist() returns int codes depending on a successful/unsuccessful login.
	 * 
	 * @return 0 if successful, -1 if credentials are wrong, -2 if the customer does
	 *         not exist.
	 */
	public int custExist(String email, String password) {

		BufferedReader filein = null;
		String info[] = null;
		String line = null;
		int result = 0;

		try {

			filein = new BufferedReader(new FileReader(CUSTFILE));
			while ((line = filein.readLine()) != null) {
				info = line.split(":");

				if (info[0].equals(email)) {

					// if credentials match
					if (info[1].equals(password)) {
						result = 0;
						break;
					}

					// if the email was found but password was wrong
					else if (!info[1].equals(password)) {
						result = -1;
						break;
					}
				}
			}

			if (line == null) {
				result = -2;
			}
			filein.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * registerCust() takes potential customer parameters and saves 
	 * them into a textfile.
	 * 
	 * @return -2 if the account already exists, -1 if there was 
	 * an error with writing the account, 0 for successful registration.
	 */
	public int registerCust(String email, String password, String firstname
			, String lastname, String address) {
		
		//Checks to see if the account already exists
		if (this.custExist(email, password) > -2) {
			return -2;
		}
		
		int result = 0;
		BufferedWriter fileout = null;
		String line = email + ":" + password + ":" + firstname + ":" + lastname + 
				":" + address;
		line.trim();
		line += "\n";
		try {
			
			//append to the file
			fileout = new BufferedWriter(new FileWriter(CUSTFILE, true));
			fileout.write(line);
			fileout.close();
			
		} catch (Exception e) {
			result = -1;
			e.printStackTrace();
		}
		return result;
	}
}
