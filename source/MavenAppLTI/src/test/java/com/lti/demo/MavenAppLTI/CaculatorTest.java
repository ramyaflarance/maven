package com.lti.demo.MavenAppLTI;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaculatorTest {

	@Test
	public void validate1() {
		int res= new Calculator().add(10, 20);
		assertEquals(30, res);
	}
	@Test
	public void validate2() {
		int res= new Calculator().add(20, 20);
		assertEquals(40, res);
		
	}
	@Test
	public void validate3() {
		int res= new Calculator().prod(10, 20);
		assertEquals(200, res);
	}



}
