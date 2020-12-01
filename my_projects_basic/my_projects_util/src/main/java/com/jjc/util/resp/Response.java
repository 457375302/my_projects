package com.jjc.util.resp;

import java.io.Serializable;

public class Response<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 592173472570204292L;
	private String code;
	private String msg;
	private T data;

	public Response() {
	}

	public Response(T data) {
		this.code = "0000";
		this.data = data;
	}

	public Response(String code, T data) {
		this.code = code;
		this.data = data;
	}

	public Response(String code, String msg, T data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return this.code.equals("0000");
	}
}