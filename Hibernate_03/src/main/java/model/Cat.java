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
	private boolean sex;
	
//	bắt buộc có 1 constructor rỗng
	public Cat() {}

	public Cat(String name, Date dob, boolean sex) {
		this.name = name;
		this.dob = dob;
		this.sex = sex;
	}
	
	public Cat(Integer id, String name, Date dob, boolean sex) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.sex = sex;
	}

	@Id // khóa chính
	@GeneratedValue // tự động tăng auto number
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

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Cat [id=" + id + ", name=" + name + ", dob=" + dob + ", sex=" + sex + "]";
	}
	
}
