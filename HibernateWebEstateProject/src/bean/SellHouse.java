package bean;

import java.sql.Date;

public class SellHouse {
	
	private int house_id;
	private int floors;
	private int price;
	private String garden;
	
	private int person_id;
	private String firstname;
	private String name;
	private String address;
	
	private String date;
	private String place;
	
	private int noOfInstallments;
	private int interestrate;
	
	
	public SellHouse(){}


	public int getHouse_id() {
		return house_id;
	}


	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}


	public int getFloors() {
		return floors;
	}


	public void setFloors(int floors) {
		this.floors = floors;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getGarden() {
		return garden;
	}


	public void setGarden(String garden) {
		this.garden = garden;
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


	public int getNoOfInstallments() {
		return noOfInstallments;
	}


	public void setNoOfInstallments(int noOfInstallments) {
		this.noOfInstallments = noOfInstallments;
	}


	public int getInterestrate() {
		return interestrate;
	}


	public void setInterestrate(int interestrate) {
		this.interestrate = interestrate;
	}
	
	
	
}
