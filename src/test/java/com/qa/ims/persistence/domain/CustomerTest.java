package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class CustomerTest {

	private static Customer testCustomer;
	
	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Customer.class).verify();
	}
	@Test
	public void Customertest() {
		testCustomer = new Customer();
		assertNotNull(testCustomer);
	}
	
	@Test
	public void CustomerOnetest() {
		testCustomer = new Customer("John", "Doe");
		assertNotNull(testCustomer);
	}
	@Test
	public void CustomerTwotest() {
		testCustomer = new Customer((long) 1, "John", "Doe");
		assertNotNull(testCustomer);
	}
	@Test
	public void getIdtest() {
	Customer john = new Customer((long) 1, "John", "Doe");
	assertSame((long) 1, john.getId());
	}
	@Test
	public void setIdtest() {
		Long number = (long) 20;
		Customer john = new Customer("John", "jones");
		john.setId(number);
		assertEquals(number, john.getId());
	}
	
	@Test
	public void getFirstNametest() {
		Customer john = new Customer((long) 1, "John", "jones");
		assertSame(("John"), john.getFirstName());
	}
	@Test
	public void setFirstNametest() {
		String firstName = "John";
		Customer john = new Customer();
		john.setFirstName(firstName);
		assertEquals(firstName, john.getFirstName());
	}
	@Test
	public void getSurnametest() {
		Customer john = new Customer((long) 1, "John", "jones");
		assertSame(("jones"), john.getSurname());
	}
	@Test
	public void setSurnametest() {
		String surname = "jones";
		Customer john = new Customer();
		john.setSurname(surname);
		assertEquals(surname, john.getSurname());
	}
	@Test
	public void toStringtest() {
		Customer john = new Customer((long) 8, "John", "jones");
		assertEquals("id:8 first name:John surname:jones", john.toString());
	}
	
	
}
