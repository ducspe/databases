package bean;

import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class PurchaseContract extends Contract{

	private int noOfInstallments;
	private int interestrate;
	
	public PurchaseContract(){}

	
	
	public PurchaseContract(Date contractDate, String place, int noOfInstallments, int interestrate) {
		super(contractDate, place);
		this.noOfInstallments = noOfInstallments;
		this.interestrate = interestrate;
	}


	public int getNoOfInstallments() {
		return noOfInstallments;
	}

	public void setNoOfInstallments(int noOfInstallments) {
		this.noOfInstallments = noOfInstallments;
	}

	public int getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(int interestrate) {
		this.interestrate = interestrate;
	}



	@Override
	public String toString() {
		return "PurchaseContract [pc_id=" + ", noOfInstallments="
				+ noOfInstallments + ", interestrate=" + interestrate + "]";
	}
	
	
	
}
