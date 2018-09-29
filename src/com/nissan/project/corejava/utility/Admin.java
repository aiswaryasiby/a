package com.nissan.project.corejava.utility;

public class Admin {
private String adminId;
private String password;

public Admin(String adminId,String password)
{
	this.adminId=adminId;
	this.password=password;
}
	
	public boolean  verify(String adminId,String password) {
		if(this.adminId.equals(adminId)&&this.password.equals(password))
			return true;
		else
			return false;
		

	}
	
	public void addFlightDetails()
	{
		FlightDetails f=new FlightDetails(flightid, flightName, from, to, date, fare, noOfSeats);

	}

}
