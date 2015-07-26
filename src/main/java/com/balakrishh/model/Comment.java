package com.balakrishh.model;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Comment {
	private String name;
	private String body;
	private Date date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@JsonSerialize
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
