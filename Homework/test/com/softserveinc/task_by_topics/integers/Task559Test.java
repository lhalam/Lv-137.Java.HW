package com.softserveinc.task_by_topics.integers;

import java.io.ByteArrayOutputStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.softserveinc.homework.Task;
import com.softserveinc.tools.Constants;
import com.softserveinc.tools.StreamRedirector;

public class Task559Test {
	private static final String INCORRECT_INPUT = "uy342";
	private static final String CORRECT_INPUT = "10000";
	private static final String RESULT = "[1, 3, 7, 31, 127, 8191]";

	private Task task;

	@Test
	public void incorrectInputTest() {
		StreamRedirector.setInput(INCORRECT_INPUT);
		task = new Task559();

		ByteArrayOutputStream pipeOut = StreamRedirector.getOutputStream();

		task.startTask();

		Assert.assertEquals(Constants.NOT_NATURAL_NUMBER_MESSAGE,
				pipeOut.toString());
	}

	@Test
	public void testTask() {
		StreamRedirector.setInput(CORRECT_INPUT);
		task = new Task559();

		ByteArrayOutputStream pipeOut = StreamRedirector.getOutputStream();

		task.startTask();

		Assert.assertEquals(RESULT, pipeOut.toString());
	}

	@After
	public void tearDown() {
		StreamRedirector.revertStreams();
	}
}
