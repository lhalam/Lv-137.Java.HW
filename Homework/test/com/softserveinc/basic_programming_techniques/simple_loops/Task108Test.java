package com.softserveinc.basic_programming_techniques.simple_loops;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.softserveinc.basic_programming_techniques.simple_loops.Task108;

public class Task108Test {
	private static Task108 task;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		task = new Task108();
	}

	@Test
	public void testCalculate() {
		int expected = 16;
		int actual = task.calculate(12);
		assertEquals(expected, actual);
	}
}
