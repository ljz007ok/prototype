package com.gupao.prototype;

/**
 * 深克隆
 * 利用clone方法实现
 * @author ljz
 *
 */
public class TeacherOne implements Cloneable {
	private int age;
	private String name;
	private Student student;
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
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	//深克隆
	@Override
	protected Object clone() throws CloneNotSupportedException {
		TeacherOne newTeacherOne = (TeacherOne) super.clone();
		//由于TeacherOne的student变量是引用类型，所以还得再次克隆
		Student newStudent = (Student) newTeacherOne.getStudent().clone();
		newTeacherOne.setStudent(newStudent);		
		return newTeacherOne;
	}
	
}
