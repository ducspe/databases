package bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sells {
	@Id
	private int sells_id;
	private int house_id;
	private int person_id;
	private int purchasecontract_id;
	
	public Sells(){}
	
	public Sells(int house_id, int person_id, int purchasecontract_id) {
		super();
		this.house_id = house_id;
		this.person_id = person_id;
		this.purchasecontract_id = purchasecontract_id;
	}



	public int getSells_id() {
		return sells_id;
	}

	public void setSells_id(int sells_id) {
		this.sells_id = sells_id;
	}

	public int getHouse_id() {
		return house_id;
	}

	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public int getPurchasecontract_id() {
		return purchasecontract_id;
	}

	public void setPurchasecontract_id(int purchasecontract_id) {
		this.purchasecontract_id = purchasecontract_id;
	}
	
	
	
}
