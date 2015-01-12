package com.softserveinc.basic_programming_techniques.nested_loops;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.softserveinc.basic_programming_techniques.nested_loops.Task322;

public class TestTask322 {
	public static Task322 task;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		task = new Task322();
	}

	@Test
	public void testMax() {
		int num1 = 5;
		int num2 = 6;
		int expected = 6;
		int actual = task.max(num1, num2);
		assertTrue(expected == actual);
	}

	@Test
	public void testMaxOfEqualNum() {
		int num1 = 5;
		int num2 = 5;
		int expected = 5;
		int actual = task.max(num1, num2);
		assertTrue(expected == actual);
	}

	@Test
	public void testSumOfDividers() {
		int num = 100;
		int expected = 217;
		int actual = task.sumOfDividers(num);
		assertTrue(expected == actual);
	}
	
	@Test
	public void testGetElement() {
		int expected = 9240;
		int actual = task.getElement();
		assertTrue(expected == actual);
				
	}
}
