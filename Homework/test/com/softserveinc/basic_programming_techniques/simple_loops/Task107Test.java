package com.softserveinc.basic_programming_techniques.simple_loops;

import com.softserveinc.basic_programming_techniques.simple_loops.Task_107;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Volodymyr
 */
public class Task107Test {
	private Task_107 taskObj1;
	private Task_107 taskObj2;

	@Before
	public void setUp() {
		taskObj1 = new Task_107();
		taskObj2 = new Task_107();
	}

	@Test
	public void task107Test() {
		Assert.assertTrue(taskObj1.solveTask(1000) == taskObj2.solveTask(1000));
	}

}
