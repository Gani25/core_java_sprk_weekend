package com.sprk.day7.generics;

public class Response<T> {
	
	private String message;
	
	private T data;

	public Response(String message, T data) {
		super();
		this.message = message;
		this.data = data;
	}

	public Response() {
		// TODO Auto-generated constructor stub
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Response [message=" + message + ", data=" + data + "]";
	}
	
	
	
	

}
