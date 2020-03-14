package com.springbootmvc.model;

import javax.validation.constraints.Size;

public class Comment {
	
	
	@Size(min=2,max=20, message = "please enter the appropriate name between 2 and 20")
	
	private String name;
	private String comment;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public Comment(String name, String comment) {
		super();
		this.name = name;
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "Comment [name=" + name + ", comment=" + comment + "]";
	}
	
	

}
