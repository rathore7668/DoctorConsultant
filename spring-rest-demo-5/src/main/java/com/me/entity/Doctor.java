package com.me.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int age;
	
	@Column(name="nameDoc")
	@NotBlank
	private String name;
	
	
	private String emailid;

	public Doctor() {
		super();
	}

	public Doctor(int age, String name, String emailid) {
		super();
		this.age = age;
		this.name = name;
		this.emailid = emailid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		//if (String.floatToRawIntBits(emailid) != Float.floatToIntBits(other.emailid))
			//return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", emailid=" + emailid+ "]";
	}
	
	
}