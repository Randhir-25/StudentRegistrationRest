package com.incedo.responsebean;


/**
 * The Class ErrorResponse.
 */
public class ErrorResponse {
	
	/** The error code. */
	private int errorCode;
	
	/** The message. */
	private String message;
	
	/**
	 * Gets the error code.
	 *
	 * @return the error code
	 */
	public int getErrorCode() {
		return errorCode;
	}
	
	/**
	 * Sets the error code.
	 *
	 * @param errorCode the new error code
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}