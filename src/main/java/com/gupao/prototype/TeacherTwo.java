package com.gupao.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 深克隆方式二使用序列号和反序列化来实现
 * @author ljz
 *
 */
public class TeacherTwo implements Serializable {
	private int age;
	private String name;
	private StudentTwo student;
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
	public StudentTwo getStudent() {
		return student;
	}
	public void setStudent(StudentTwo student) {
		this.student = student;
	}
	
	//深克隆
	public Object deepCopt() throws Exception {
		//将当前这个对象写到一个输出流当中，，因为这个对象的类实现了Serializable这个接口，所以在这个类中
		//有一个引用，这个引用如果实现了序列化，那么这个也会写到这个输出流当中
		//将对象写入内存中
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream  oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
				
		//这个就是将流中的东西读出类，读到一个对象流当中，这样就可以返回这两个对象的东西，实现深克隆
		//将写入内存中的对象读出来
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}
	
}
