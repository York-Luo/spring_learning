package com.luoy.vo;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = -8828293922119861478L;

	private String id;
	
	private Integer age;
	
	private Classroom cl;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Classroom getCl() {
		return cl;
	}

	public void setCl(Classroom cl) {
		this.cl = cl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((cl == null) ? 0 : cl.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (cl == null) {
			if (other.cl != null)
				return false;
		} else if (!cl.equals(other.cl))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Student(String id, Integer age, Classroom cl) {
		super();
		this.id = id;
		this.age = age;
		this.cl = cl;
	}

	public Student() {
		super();
	}
	
	
}
