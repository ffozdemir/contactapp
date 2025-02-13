package com.ffozdemir.contactapp.payload.messages;

public class ErrorMessages {


	private ErrorMessages() {
		//static class
	}

	public static final String NOT_FOUND_MESSAGE = "Message not Found with ID : %s";
	public static final String NOT_FOUND_MESSAGE_BY_EMAIL = "Message not Found by Email : %s";
	public static final String NOT_FOUND_MESSAGE_BETWEEN_DATES = "Message not Found between Dates : %s and %s";
	public static final String NOT_FOUND_MESSAGE_BETWEEN_TIMES = "Message not Found between Times : %s and %s";
	public static final String NOT_FOUND_MESSAGE_BY_SUBJECT = "Message not Found by Subject : %s";

}
