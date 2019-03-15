package com.gupao.prototype;

/**
 * 浅克隆
 * @author ljz
 *
 */
public class Student implements Cloneable {
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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//实现浅克隆
		return super.clone();
	}	
}
