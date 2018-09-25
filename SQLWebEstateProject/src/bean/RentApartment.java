package bean;

import java.sql.Date;

public class RentApartment {

	
	private int apartment_id;
	private int floor;
	private int rent;
	private int rooms;
	private String balcony;
	private String builtinkitchen;
	
	private int person_id;
	private String firstname;
	private String name;
	private String address;
	
	private String date;
	private String place;
	
	private int tc_id;
	private String startdate;
	private int duration;
	private int additionalcosts;
	
	public RentApartment(){}

	public int getApartment_id() {
		return apartment_id;
	}

	public void setApartment_id(int apartment_id) {
		this.apartment_id = apartment_id;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public String getBalcony() {
		return balcony;
	}

	public void setBalcony(String balcony) {
		this.balcony = balcony;
	}

	public String getBuiltinkitchen() {
		return builtinkitchen;
	}

	public void setBuiltinkitchen(String builtinkitchen) {
		this.builtinkitchen = builtinkitchen;
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getTc_id() {
		return tc_id;
	}

	public void setTc_id(int tc_id) {
		this.tc_id = tc_id;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getAdditionalcosts() {
		return additionalcosts;
	}

	public void setAdditionalcosts(int additionalcosts) {
		this.additionalcosts = additionalcosts;
	}
}
