package bankAccountApp;

public abstract class Account implements InterestBaseRate{

	//List common properties for savings and checking account
	private String name;
	private String sSN;
	private double balance;
	
	static int index=9999;
	protected String accountNumber;
	protected double rate;
	
	
	
	
	//constructor to set base properties and initialize the account
	public Account(String name,String sSN,double depoBalance) {
		this.name=name;
		this.sSN=sSN;
		this.balance=depoBalance;
		
		
		//set account number
		
		this.accountNumber=generateAccountNumber();
		setRate();
		
	}
	public abstract void setRate();
	
	public void compond() {
		double accuredInterest=balance*(rate/100);
		balance+=accuredInterest;
		System.out.println("AccuredInterest : "+accuredInterest);
		showBalance();
	}
	//List common methods
	
	public void showInfo() {
		System.out.println(
				"NAME : " + name +
				"\nACCOUNT NUMBER : " + accountNumber +
				"\nBALANCE : " + balance + "$"+
				"\nRATE : "+rate+"%"
				);
	}
	
	private String generateAccountNumber() {
		
		
		index++;
		String lastTwoOfSSN=sSN.substring(sSN.length()-2, sSN.length());
	    int UniqueID=index;
	    int randomNumber=(int) (Math.random()*1000);
		return lastTwoOfSSN+UniqueID+randomNumber;
	}
	
	//other common transaction methods

	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Depositing money from account : "+amount+"$");
		showBalance();
	}
	public void withdraw(double amount) {
		balance-=amount;
		System.out.println("Withdrawing money from account : "+amount+"$");
	    showBalance();
	}
	public void transfer(String account,double amount) {
		balance-=amount;
		System.out.println("Amount has been paid to Account number :"+account);
	    showBalance();
	}
	
	public void showBalance() {
		System.out.println("Your Current Account Balance is : "+balance+"$");
	}
}
