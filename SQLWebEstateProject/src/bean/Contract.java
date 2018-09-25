package bean;

import java.sql.Date;

public class Contract {

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
