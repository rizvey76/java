package com.unit.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class JunitMsqr {

	@Test
	public void test() {
		JtestClass jtest=new JtestClass();
		assertEquals(10,jtest.sum(4,6));
	}

}
