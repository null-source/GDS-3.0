package testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import application.model.EmployeeHandle;
class Test_empExist {

	@Test
	void shouldExist() {
		EmployeeHandle var = new EmployeeHandle("employee", "passwordtest");
		int code = var.empExist();
		System.out.println(code);
		assertSame(3, code);
	}
	
	@Test
	void shouldNotExist() {
		EmployeeHandle var = new EmployeeHandle("badUser", "badPassword");
		int code = var.empExist();
		System.out.println(code);
		assertSame(-1, code);
	}

	@Test
	void goodUser_badPassword() {
		EmployeeHandle var = new EmployeeHandle("abc123", "badPassword");
		int code = var.empExist();
		System.out.println(code);
		assertSame(-2, code);
	}
}
