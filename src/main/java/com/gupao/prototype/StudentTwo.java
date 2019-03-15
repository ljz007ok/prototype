package com.gupao.prototype;

import java.io.Serializable;

/**
 * 深克隆实现二需要实现Serializable，采用序列化和反序列化
 * @author ljz
 *
 */
public class StudentTwo implements Serializable {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
