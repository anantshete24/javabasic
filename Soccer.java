package com.example;
//below program is example of method overriding
public class Soccer extends Sports {

	@Override
	public String getName()
	{
		return "Soccer Class";
	}
	@Override
	public void getNumberOfTeamMembers()
	{
		System.out.println("11");
	}
	public static void main(String[] args) {

		Sports c1= new Sports();
		Soccer c2 = new Soccer();
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		c1.getNumberOfTeamMembers();
		c2.getNumberOfTeamMembers();
	}

}
