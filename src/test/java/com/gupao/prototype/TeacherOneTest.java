package com.gupao.prototype;

public class TeacherOneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student();
		s1.setAge(8);
		s1.setName("李雷");
		
		TeacherOne t1 = new TeacherOne();
		t1.setAge(25);
		t1.setName("MisGao");
		t1.setStudent(s1);
		
		TeacherOne t2 = (TeacherOne) t1.clone();
		System.out.println(t1 == t2);
		System.out.println(t1.getStudent() == t2.getStudent());
	}

}
