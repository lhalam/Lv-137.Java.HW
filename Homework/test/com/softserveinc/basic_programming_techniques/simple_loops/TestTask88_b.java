package com.softserveinc.basic_programming_techniques.simple_loops;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestTas88_b {

	private static Task88_b task;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		task = new Task88_b();
	}

	@Test
	public void testIsNaturalZero() {
		assertFalse(task.isNatural(0));
	}

	@Test
	public void testIsNaturalNegative() {
		assertFalse(task.isNatural(-10));
	}

	@Test
	public void testIsNaturalTrue() {
		assertTrue(task.isNatural(1));
	}

	@Test
	public void testReverseNumber() {
		String snum = "23";
		String expected = "32";
		int revnum = Integer.parseInt(expected);
		int actual = Integer.parseInt(task.reverseNumber(snum));
		assertTrue(revnum == actual);
	}
}
