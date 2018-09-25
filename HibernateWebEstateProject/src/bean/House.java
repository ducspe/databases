package bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class House extends Estate{
	
	private int floors;
	private int price;
	private String garden;

	
	public House(){}
	
	

	public House(int floors, int price, String garden) {
		super();

		this.floors = floors;
		this.price = price;
		this.garden = garden;
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


	@Override
	public String toString() {
		return "House [house_id=" + ", floors=" + floors
				+ ", price=" + price + ", garden=" + garden;
	}
	
	
}
