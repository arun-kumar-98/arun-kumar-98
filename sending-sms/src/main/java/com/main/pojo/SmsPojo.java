package com.main.pojo;

public class SmsPojo {
	private String to;
	private String message;

	public SmsPojo(String to, String message) {
		super();
		this.to = to;
		this.message = message;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
