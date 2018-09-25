package bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rents {
	@Id
	private int rents_id;
	private int apartment_id;
	private int person_id;
	private int tenancycontract_id;
	
	public Rents(){}

	public Rents(int apartment_id, int person_id, int tenancycontract_id) {
		super();
		this.apartment_id = apartment_id;
		this.person_id = person_id;
		this.tenancycontract_id = tenancycontract_id;
	}

	public int getRents_id() {
		return rents_id;
	}

	public void setRents_id(int rents_id) {
		this.rents_id = rents_id;
	}

	public int getApartment_id() {
		return apartment_id;
	}

	public void setApartment_id(int apartment_id) {
		this.apartment_id = apartment_id;
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public int getTenancycontract_id() {
		return tenancycontract_id;
	}

	public void setTenancycontract_id(int tenancycontract_id) {
		this.tenancycontract_id = tenancycontract_id;
	}

	@Override
	public String toString() {
		return "Rents [rents_id=" + rents_id + ", apartment_id=" + apartment_id
				+ ", person_id=" + person_id + ", tenancycontract_id="
				+ tenancycontract_id + "]";
	}
	
	
}
