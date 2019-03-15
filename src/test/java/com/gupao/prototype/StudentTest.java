package com.gupao.prototype;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setAge(24);
		student1.setName("张三");
		Student student2 = null;
		try {
			student2 = (Student)student1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(student1 == student2);
		System.out.println(student1.getName());
		System.out.println(student2.getName());
	}

}
