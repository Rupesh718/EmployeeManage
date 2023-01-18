package com.employee.Exceptions;

import java.util.Date;

public class ErrorsR {
	
	private Date doe;
	private String errorMeg;
	private String path;
	public ErrorsR(Date doe, String errorMeg, String path) {
		super();
		this.doe = doe;
		this.errorMeg = errorMeg;
		this.path = path;
	}
	public ErrorsR(Date date, String string, Object object) {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date getDoe() {
		return doe;
	}
	public void setDoe(Date doe) {
		this.doe = doe;
	}
	public String getErrorMeg() {
		return errorMeg;
	}
	public void setErrorMeg(String errorMeg) {
		this.errorMeg = errorMeg;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
		

}
