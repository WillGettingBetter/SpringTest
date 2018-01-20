package com.eec.entity;

/**
 * 学生实体类
 * 
 * @author SJF18
 * 
 */
public class Student {

	private String name;
	private int age;
	private String school;

	public Student() {
		super();
	}

	public Student(String name, int age, String school) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
	}

	public void show() {
		System.out.println("我的名字是:" + this.name + ",年龄是:" + this.age
				+ ",所处的学校是:" + this.school);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

}
