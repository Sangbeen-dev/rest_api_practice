package com.example.rest_practice.dto;

public class Member {
	private Integer id;
	private String name;
	private Integer age;
	private String dept;
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + ", dept=" + dept + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
}
