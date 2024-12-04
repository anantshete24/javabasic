package com.example;
public class Student {
	
	private int id;
	private String fname;
	private double cgpa;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

	Student(int id, String fname, double cgpa)
	{
		this.id=id;
		this.fname=fname;
		this.cgpa=cgpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", cgpa=" + cgpa + "]";
	}
	
}
