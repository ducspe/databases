package bean;

public class House {
	private int house_id;
	private int floors;
	private int price;
	private String garden;

	
	public House(){}
	
	

	public House(int house_id, int floors, int price, String garden) {
		super();
		this.house_id = house_id;
		this.floors = floors;
		this.price = price;
		this.garden = garden;
	}



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


	@Override
	public String toString() {
		return "House [house_id=" + house_id + ", floors=" + floors
				+ ", price=" + price + ", garden=" + garden;
	}
	
	
}
