package com.softserveinc.basic_programming_techniques.nested_loops;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.BeforeClass;
import org.junit.Test;

import com.softserveinc.basic_programming_techniques.nested_loops.Task331;

public class Task331Test {
	private static Task331 task;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		task = new Task331();
	}

	@Test
	public void testVerifyForDecompositionShouldReturnFalse() {
		boolean result = task.verifyForDecomposition(15);
		assertFalse(result);
	}

	@Test
	public void testVerifyForDecompositionShouldReturnTrue() {
		boolean result = task.verifyForDecomposition(12);
		assertTrue(result);
	}

}
