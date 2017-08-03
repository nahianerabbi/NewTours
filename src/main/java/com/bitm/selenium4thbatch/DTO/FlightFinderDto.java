package com.bitm.selenium4thbatch.DTO;

public class FlightFinderDto {
	
	private String passengers;
	private String departingFrom;
	private String departingDate;
	private String departingMonth;
	private String arrivingIn;
	private String returningMonth;
	private String returningDate;
	private String airline;
	
	
	public String getPassengers() {
		return passengers;
	}
	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}
	public String getDepartingFrom() {
		return departingFrom;
	}
	public void setDepartingFrom(String departingFrom) {
		this.departingFrom = departingFrom;
	}
	public String getDepartingDate() {
		return departingDate;
	}
	public void setDepartingDate(String departingDate) {
		this.departingDate = departingDate;
	}
	public String getDepartingMonth() {
		return departingMonth;
	}
	public void setDepartingMonth(String departingMonth) {
		this.departingMonth = departingMonth;
	}
	public String getArrivingIn() {
		return arrivingIn;
	}
	public void setArrivingIn(String arrivingIn) {
		this.arrivingIn = arrivingIn;
	}
	public String getReturningMonth() {
		return returningMonth;
	}
	public void setReturningMonth(String returningMonth) {
		this.returningMonth = returningMonth;
	}
	public String getReturningDate() {
		return returningDate;
	}
	public void setReturningDate(String returningDate) {
		this.returningDate = returningDate;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	
	@Override
	public String toString(){
		return "FlightFinderDto [passengers=" + passengers + ", airline=" + airline + ", returningDate="+returningDate+", returningMonth="+returningMonth+", arrivingIn="+arrivingIn+", departingMonth="+departingMonth+", departingDate="+departingDate+", departingFrom="+departingFrom+"]";
		
	}

}
