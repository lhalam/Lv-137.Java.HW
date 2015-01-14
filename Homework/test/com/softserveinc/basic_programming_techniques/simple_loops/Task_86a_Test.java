package com.softserveinc.basic_programming_techniques.simple_loops;

import static org.junit.Assert.*;
import org.junit.Test;
import com.softserveinc.basic_programming_techniques.simple_loops.Task_86_a;

public class Task_86a_Test {

	@Test
	public void testCountOfDigitsShouldBePositive() {
		assertTrue(Task_86_a.getDigitsCount(1234) == 4);
	}
	
	@Test
	public void testCountOfDigitsShouldBeNotZero() {
		assertTrue(Task_86_a.getDigitsCount(0) == 1);
	}
	
	@Test
	public void testCountOfDigitsInNegativeNumberShouldBePositive() {
		assertTrue(Task_86_a.getDigitsCount(-231) == 3);
	}
	
	@Test
	public void testCountOfDigitsShouldBeFalse() {
		assertFalse(Task_86_a.getDigitsCount(25) == 5);
	}

}
