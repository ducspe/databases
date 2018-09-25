package bean;

public class PurchaseContract {

	private int pc_id;
	private int noOfInstallments;
	private int interestrate;
	
	public PurchaseContract(){}

	
	
	public PurchaseContract(int pc_id, int noOfInstallments, int interestrate) {
		super();
		this.pc_id = pc_id;
		this.noOfInstallments = noOfInstallments;
		this.interestrate = interestrate;
	}



	public int getPc_id() {
		return pc_id;
	}



	public void setPc_id(int pc_id) {
		this.pc_id = pc_id;
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
		return "PurchaseContract [pc_id=" + pc_id + ", noOfInstallments="
				+ noOfInstallments + ", interestrate=" + interestrate + "]";
	}
	
	
	
}
