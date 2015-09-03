package com.yunjiang.sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MavenTest {
	
	private static final Logger logger = LogManager.getLogger(MavenTest.class);

	public static void main(String[] args) {
		logger.info("sample");
		System.out.println("Hello World!");
	}

}
