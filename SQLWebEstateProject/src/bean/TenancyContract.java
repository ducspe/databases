package bean;

import java.sql.Date;

public class TenancyContract {

	private int tc_id;
	private Date startdate;
	private int duration;
	private int additionalcosts;
	
	public TenancyContract(){}

	public TenancyContract(int tc_id, Date startdate, int duration, int additionalcosts) {
		super();
		this.tc_id = tc_id;
		this.startdate = startdate;
		this.duration = duration;
		this.additionalcosts = additionalcosts;
	}

	public int getTc_id() {
		return tc_id;
	}

	public void setTc_id(int tc_id) {
		this.tc_id = tc_id;
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
		return "TenancyContract [tc_id=" + tc_id + ", startdate=" + startdate
				+ ", duration=" + duration + ", additionalcosts="
				+ additionalcosts + "]";
	}
	
	
	
	
}
