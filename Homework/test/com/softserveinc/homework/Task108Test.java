package com.softserveinc.homework;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.softserveinc.basic_programming_techniques.simple_loops.Task108;
import com.softserveinc.tools.Executor;

public class Task108Test {
	private static Method[] methods;
	private static Method calculate;
	private static Task108 task;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		task = new Task108();
		methods = Task108.class.getDeclaredMethods();
		for (Method m : methods) {
			if (m.getName().equals("calculate")) {
				m.setAccessible(true);
				calculate = m;
			}
		}

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculate() {

		try {
			int result = (int) calculate.invoke(task, 5);
			assertEquals(4, result);
		} catch (IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
