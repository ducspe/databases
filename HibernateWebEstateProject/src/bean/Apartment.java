package bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Apartment extends Estate{
	
	private int floor;
	private int rent;
	private int rooms;
	private String balcony;
	private String builtinkitchen;
	
	
	public Apartment(){}


	public Apartment(int floor, int rent, String balcony,	String builtinkitchen) {
		super();
		this.floor = floor;
		this.rent = rent;
		this.balcony = balcony;
		this.builtinkitchen = builtinkitchen;
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


	@Override
	public String toString() {
		return "Apartment [apartment_id=" + ", floor=" + floor
				+ ", rent=" + rent + ", rooms=" + rooms + ", balcony="
				+ balcony + ", builtinkitchen=" + builtinkitchen + "]";
	}
	
	
	
}
