package com.wms.entity;

import java.util.Date;

public class Task {
	private int id;//int?
	private String name;
	private Date startTime;
	private Date deadLine;
	public Task(int id, String name, Date startTime, Date deadLine) {
		super();
		this.id = id;
		this.name = name;
		this.startTime = startTime;
		this.deadLine = deadLine;
	}
	public Task() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}
}
