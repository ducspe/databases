package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import dao.EstateAgentDao;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Estate {
	@Id @GeneratedValue
	private int estate_id;
	private String city;
	private int postalcode;
	private String street ;
	private int streetnumber;
	private int squarearea;
	
	@ManyToOne
	@JoinColumn(name="MANAGER")
	private EstateAgent manager;
	
	public Estate(){}

	public int getEstate_id() {
		return estate_id;
	}

	public void setEstate_id(int id) {
		this.estate_id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getStreetnumber() {
		return streetnumber;
	}

	public void setStreetnumber(int streetnumber) {
		this.streetnumber = streetnumber;
	}

	public int getSquarearea() {
		return squarearea;
	}

	public void setSquarearea(int squarearea) {
		this.squarearea = squarearea;
	}

	public EstateAgent getManager() {
		return manager;
	}

	public void setManager(EstateAgent manager) {
		this.manager = manager;
	}
	
}
