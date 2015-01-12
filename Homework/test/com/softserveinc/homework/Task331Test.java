package com.softserveinc.homework;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.BeforeClass;
import org.junit.Test;

import com.softserveinc.basic_programming_techniques.nested_loops.Task331;

public class Task331Test {
	private static Method[] methods;
	private static Method calculateMethod;
	private static Method verifyForNotDecompositionMethod;
	private static Task331 task;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		task = new Task331();
		methods = Task331.class.getDeclaredMethods();
		for (Method m : methods) {
			switch (m.getName()) {
			case "calculate":
				calculateMethod = m;
				calculateMethod.setAccessible(true);
				break;
			case "verifyForNotDecomposition":
				verifyForNotDecompositionMethod = m;
				verifyForNotDecompositionMethod.setAccessible(true);
				break;
			default:
				break;
			}

		}

	}

	@Test
	public void testVerifyForNotDecompositionShouldReturnTrue() {
		try {
			boolean result = (boolean) verifyForNotDecompositionMethod.invoke(
					task, 15);
			assertTrue(result);
		} catch (IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testVerifyForNotDecompositionShouldReturnFalse() {
		try {
			boolean result = (boolean) verifyForNotDecompositionMethod.invoke(
					task, 12);
			assertFalse(result);
		} catch (IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
