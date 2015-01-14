package com.softserveinc.basic_programming_techniques.simple_loops;

import static org.junit.Assert.*;
import org.junit.Test;
import com.softserveinc.basic_programming_techniques.simple_loops.Task_86_b;

public class Task_86b_Test {

	@Test
	public void testSumOfDigitsShouldBePositive() {
		assertTrue(Task_86_b.getDigitsSum(1234) == 10);
	}
	
	@Test
	public void testSumOfDigitsShouldBeZero() {
		assertTrue(Task_86_b.getDigitsSum(0) == 0);
	}
	
	@Test
	public void testSumOfDigitsInNegativeNumberShouldBePositive() {
		assertTrue(Task_86_b.getDigitsSum(-231) == 6);
	}
	
	@Test
	public void testSumOfDigitsShouldBeFalse() {
		assertFalse(Task_86_b.getDigitsSum(25) == 5);
	}

}
