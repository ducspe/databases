package bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Contract {
	@Id @GeneratedValue
	private int contract_id;
	private Date date;
	private String place;
	
	public Contract(){}
	
	

	public Contract(Date date, String place) {
		super();
		this.date = date;
		this.place = place;
	}



	public int getContract_id() {
		return contract_id;
	}

	public void setContract_id(int contract_id) {
		this.contract_id = contract_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}



	@Override
	public String toString() {
		return "Contract [date=" + date
				+ ", place=" + place + "]";
	}
	
	
	
}
