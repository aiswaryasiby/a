package com.nissan.project.corejava.utility;

import java.util.ArrayList;

public class FlightDetails {
	
	private int flightId;
	private String flightName;
	private String from;
	private String to;
	private String date;
	private String fare;
	private int noOfSeats;
	
	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public FlightDetails(int flightid,String flightName,String from,String to,String date,String fare,int noOfSeats)
	{
		this.flightId=flightid;
		this.flightName=flightName;
		this.from=from;
		this.to=to;
		this.date=date;
		this.fare=fare;
		this.noOfSeats=noOfSeats;
	}
}
