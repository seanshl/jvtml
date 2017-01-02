package com.shiyaoeating.jvtml.main;

public class MainComposer {
	private static final String DOCTYPE = "<!DOCTYPE>";
	private static final String HTML_HEADER = "<html>";
	private static final String HTML_END = "</html>";
	
	private StringBuilder breakLine(StringBuilder htmlBuilder) {
		htmlBuilder.append("\n");
		return htmlBuilder;
	}
}
