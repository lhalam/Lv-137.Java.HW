package com.softserveinc.basic_programming_techniques.simple_loops;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestTask88_a {
	private static Task88_a task;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		task = new Task88_a();
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
	public void testConsistSymbTrue() {
		char[] array = {'3','2','1','4'};
		assertTrue(task.ConsistSymb(array));
	}
	
	@Test
	public void testConsistSymbFalse() {
		char[] array = {'1','2','1','4'};
		assertFalse(task.ConsistSymb(array));
	}
}
