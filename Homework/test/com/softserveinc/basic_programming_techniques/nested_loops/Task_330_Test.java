package com.softserveinc.basic_programming_techniques.nested_loops;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.softserveinc.basic_programming_techniques.nested_loops.Task_330;

public class Task_330_Test {

	@Test
	public void testIsPerfectShouldBeTrue() {
		assertTrue(Task_330.isPerfect(28));
	}

	@Test
	public void testIsPerfectShouldBeFalse() {
		assertFalse(Task_330.isPerfect(-25));
	}

	@Test
	public void testPerfectNumbersListShouldBeTrue() {
		ArrayList<Long> listOfPerfectNumbers = new ArrayList<Long>();

		listOfPerfectNumbers.add(6L);
		listOfPerfectNumbers.add(28L);
		listOfPerfectNumbers.add(496L);

		assertTrue(Task_330.getPerfectNumbers(1000).equals(listOfPerfectNumbers));
	}

}
