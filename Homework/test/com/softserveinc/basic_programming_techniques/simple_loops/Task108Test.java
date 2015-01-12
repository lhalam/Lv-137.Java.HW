package com.softserveinc.basic_programming_techniques.simple_loops;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.BeforeClass;
import org.junit.Test;

import com.softserveinc.basic_programming_techniques.simple_loops.Task108;

public class Task108Test {
	private static Method[] methods;
	private static Method calculateMethod;
	private static Task108 task;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		task = new Task108();
		methods = Task108.class.getDeclaredMethods();
		for (Method m : methods) {
			if (m.getName().equals("calculate")) {
				calculateMethod = m;
			}
		}
		calculateMethod.setAccessible(true);
	}

	@Test
	public void testCalculate() {
		int expected = 16;
		try {
			int actual = (int) calculateMethod.invoke(task, 12);
			assertEquals(expected, actual);
		} catch (IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
