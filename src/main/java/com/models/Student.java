package com.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studId;

	private NameDetails names;
	@OneToMany(mappedBy = "Student")
	@JoinColumn(name = "lapId")
	private List<Laptop> laptop;

//	@Transient
	private int age;
	public Student() {
		
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public NameDetails getNames() {
		return names;
	}
	public void setNames(NameDetails names) {
		this.names = names;
	}
	 
	

}
