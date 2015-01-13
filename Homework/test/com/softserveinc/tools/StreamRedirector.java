package com.softserveinc.tools;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class StreamRedirector {
	private static final PrintStream stdout = System.out;
	private static final InputStream stdin = System.in;

	public static ByteArrayOutputStream getOutputStream() {
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(stream, true));
		return stream;
	}

	public static void setInput(String input) {
		System.setIn(new ByteArrayInputStream(input.getBytes()));
	}

	public static void revertStreams() {
		System.setOut(stdout);
		System.setIn(stdin);
	}

}
