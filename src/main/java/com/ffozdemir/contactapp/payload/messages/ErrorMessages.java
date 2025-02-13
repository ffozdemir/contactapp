package com.ffozdemir.contactapp.payload.messages;

public class ErrorMessages {


	public ErrorMessages() {
	}

	public static final String MESSAGE_NOT_FOUND = "Message not Found with ID : %s";
	public static final String MESSAGE_FOUND_BY_SUBJECT = "Message not Found by Subject : %s";
	public static final String MESSAGE_FOUND_BY_EMAIL = "Message not Found by Email : %s";
	public static final String MESSAGE_FOUND_BY_CREATION_DATE = "Message not Found by Creation Date : %s";
	public static final String MESSAGE_FOUND_BETWEEN_DATES = "Message not Found between Dates : %s and %s";
	public static final String NO_MESSAGES_FOUND = "No Messages Found";

}
