package com.gupao.prototype;

public class TeacherTwoTest {

	public static void main(String[] args) throws Exception {
		StudentTwo s1 = new StudentTwo();
		s1.setAge(9);
		s1.setName("韩梅梅");
		
		TeacherTwo t1 = new TeacherTwo();
		t1.setAge(25);
		t1.setName("MisGao");
		t1.setStudent(s1);
		
		TeacherTwo t2 = (TeacherTwo) t1.deepCopt();
		System.out.println(t1 == t2);
		System.out.println(t1.getStudent() == t2.getStudent());
	}

}
