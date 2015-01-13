package com.softserveinc.basic_programming_techniques.loops_and_branches;

import java.io.ByteArrayOutputStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.softserveinc.homework.Task;
import com.softserveinc.tools.Constants;
import com.softserveinc.tools.StreamRedirector;

/**
 * 
 * @author Oleg Pavlish
 *
 */
public class Task226Test {
	private static final String INCORRECT_INPUT = "uy342";
	private static final String CORRECT_INPUT = "12\r\n24";
	private static final String RESULT = "[24, 48, 72, 96, 120, 144, 168, 192, 216, 240, 264, 288]";

	private Task task;

	@Test
	public void incorrectInputTest() {
		StreamRedirector.setInput(INCORRECT_INPUT);
		task = new Task226();

		ByteArrayOutputStream pipeOut = StreamRedirector.getOutputStream();
		task.startTask();

		Assert.assertEquals(Constants.NOT_NATURAL_NUMBER_MESSAGE,
				pipeOut.toString());
	}
	
	@Test
	public void testTask() {
		StreamRedirector.setInput(CORRECT_INPUT);
		task = new Task226();

		ByteArrayOutputStream pipeOut = StreamRedirector.getOutputStream();

		task.startTask();

		Assert.assertEquals(RESULT, pipeOut.toString());
	}

	@After
	public void tearDown() {
		StreamRedirector.revertStreams();
	}
}
