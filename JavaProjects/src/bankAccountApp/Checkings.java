package bankAccountApp;

public class Checkings extends Account{

	//List properties specific to checking account
	private int debitCardNumber;
	private int debitCardPIN;
	
	
	
	//constructor to initialize basic checking account properties 
	public Checkings(String name,String ssn,double depositBalance) {
		super(name,ssn,depositBalance);
		this.accountNumber="2"+this.accountNumber;
		setDebitCard();
	
	}
	
   
	public void setRate() {
		rate=getBaseRate()*0.15;
		
	}
	
	//List any methods specific to checking account 
	
	private void setDebitCard() {
		this.debitCardNumber=(int) (Math.random()*Math.pow(10,12));
		this.debitCardPIN=(int)  (Math.random()*Math.pow(10,4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"Your Checkings Account Features"+
				"\nDEBIT_CARD_NUMBER : "+this.debitCardNumber +
				"\nDEBIT_CARD _PIN : "+this.debitCardPIN
				);
	}
	
}
