package testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import application.model.CustomerHandle;
class testCustomerHandle {

	@Test
	/**
	 * Try creating a customer that already exists in the file
	 */
	void createCust() {
		CustomerHandle var = new CustomerHandle();
		int result = var.registerCust("fun@notfun.com", "okfine"
				, "Jerry", "SpringRoll", "15 Chine Street");
		assertEquals(-2, result);
	}
	
	@Test
	/**
	 * Look for a customer that already exists in the file.
	 */
	void testExist() {
		CustomerHandle var = new CustomerHandle();
		int result = var.custExist("fun@notfun.com", "okfine");
		assertEquals(0, result);
	}
	
	@Test
	/**
	 * Look for a customer that does not exist in the file
	 */
	void notExist() {
		CustomerHandle var = new CustomerHandle();
		int result = var.custExist("wrong@wrong.com", "okfine");
		assertEquals(-2, result);
	}
	
}
