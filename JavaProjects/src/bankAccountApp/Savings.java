package bankAccountApp;

public class Savings extends Account {
	
	
	//List properties specific to savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxPIN;
	
	//Constructor to initialize savings account properties
	public Savings(String name,String ssn,double depositBalance) {
		super(name,ssn,depositBalance);
		this.accountNumber="1"+this.accountNumber;
		setSafetyDepositBox();
		
	}
	
	@Override
	public void setRate() {
	  rate=getBaseRate() - 0.25;
		
	}
	
	//List methods specific to savings account
 
	private void setSafetyDepositBox() {
		this.safetyDepositBoxID=(int) (Math.random()*1000);
		this.safetyDepositBoxPIN=(int) (Math.random()*10000);
		
		
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"Your Savings Account Features"+
				"\nSAFETY_DEPOSIT_BOX_ID : "+this.safetyDepositBoxID +
				"\nSAFETY_DEPOSIT_BOX_KEY : "+this.safetyDepositBoxPIN
				);
		
	}

	
}
