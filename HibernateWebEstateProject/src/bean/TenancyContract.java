package bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TenancyContract extends Contract{

	private Date startdate;
	private int duration;
	private int additionalcosts;
	
	public TenancyContract(){}

	public TenancyContract(Date contractDate, String place, Date startdate, int duration, int additionalcosts) {
		super(contractDate, place);
		this.startdate = startdate;
		this.duration = duration;
		this.additionalcosts = additionalcosts;
	}


	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
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

	@Override
	public String toString() {
		return "TenancyContract [tc_id=" + ", startdate=" + startdate
				+ ", duration=" + duration + ", additionalcosts="
				+ additionalcosts + "]";
	}
	
	
	
	
}
