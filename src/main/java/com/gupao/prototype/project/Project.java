package com.gupao.prototype.project;

/**
 * 此类在实际项目中有40多个字段
 * @author ljz
 *
 */
public class Project implements Cloneable {
	private long id;
	private String code;
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	protected Project clone() throws CloneNotSupportedException {
		return (Project) super.clone();
	}	
}
