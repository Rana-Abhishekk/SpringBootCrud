package com.xadmin.SpringBootCrud.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Subject {
	@Id
	private String id;
	private String name;
	private List<String> children;
	
	public Subject(String id, String name, List<String> children) {
		super();
		this.id = id;
		this.name = name;
		this.children = children;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Subject() {
	
	}
	public List<String> getChildren() {
		return children;
	}
	public void setChildren(List<String> children) {
		this.children = children;
	}
	
}
