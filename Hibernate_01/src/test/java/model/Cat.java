package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cat {
	private Integer id;
	private String name;
	private Date dob;
	private Boolean sex;
	
//	bắt buộc phải có 1 constructer rỗng
	public Cat() {}

	public Cat(Integer id, String name, Date dob, Boolean sex) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.sex = sex;
	}

	@Id // khóa chính
	@GeneratedValue // tự động tăng, auto number
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	
}
