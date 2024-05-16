package com.logger;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {

	private static Logger logger = null;

	String fileName = "e:/log.txt";
	PrintStream writer;

	public static Logger getInstance() {
		if(logger == null)
			logger = new Logger();
		return logger;
	}

	private Logger() {

		try {
			writer = new PrintStream(fileName);
			System.out.println("Logger created. Will log to " + fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}

	}

	void logMessage(String message) {

		writer.println(LocalDateTime.now() + "  " + message);
	}

	protected void finalize() {
		writer.close();
	}

}
