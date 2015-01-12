package com.softserveinc.basic_programming_techniques.simple_loops;

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
public class Task87Test {
	private static final String INCORRECT_INPUT = "uy342";
	private static final String CORRECT_INPUT = "678465\r\n3";
	private static final String RESULT = "15";

	private Task task;

	@Test
	public void incorrectInputTest() {
		StreamRedirector.setInput(INCORRECT_INPUT);
		task = new Task87();

		ByteArrayOutputStream pipeOut = StreamRedirector.getOutputStream();

		task.startTask();

		Assert.assertEquals(Constants.NOT_NATURAL_NUMBER_MESSAGE,
				pipeOut.toString());
	}

	@Test
	public void testTask() {
		StreamRedirector.setInput(CORRECT_INPUT);
		task = new Task87();

		ByteArrayOutputStream pipeOut = StreamRedirector.getOutputStream();

		task.startTask();

		Assert.assertEquals(RESULT, pipeOut.toString());
	}

	@After
	public void tearDown() {
		StreamRedirector.revertStreams();
	}
}
