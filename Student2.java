package com.example;

public class Student2 implements Comparable<Student2>
{
		
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

		Student2(int id, String fname, double cgpa)
		{
			this.id=id;
			this.fname=fname;
			this.cgpa=cgpa;
		}

		@Override
		public String toString() {
			return "Student2 [id=" + id + ", fname=" + fname + ", cgpa=" + cgpa + "]";
		}




		@Override
		public int compareTo(Student2 other) {

			if(this.cgpa!=other.cgpa)
			{
				return Double.compare(other.cgpa, this.cgpa);
			}
			else if(!this.fname.equals(other.fname))
			{
				return this.fname.compareTo(other.fname);
			}
			else
			{
				return Integer.compare(this.id, other.id);
			}

		}
		
	}


