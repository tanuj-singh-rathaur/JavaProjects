package bankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankApp {
  public static void main(String[] args) {
//	  Savings savact=new Savings("Tanuj Singh Rathaur","456215478",2500);
//	  Checkings chkact=new Checkings("Anuj Singh Rathaur","789654218",1500);
//	  
//	  savact.compond();
//	  
//	  
//	  savact.showInfo();
//	  System.out.println("*******************");
//	  chkact.showInfo();
//	  System.out.println("*******************");
//	  savact.showInfo();
//	  savact.deposit(5000);
//	  savact.withdraw(200);
//	  savact.transfer("75123658945", 2500);
	  String file="C:\\Users\\Tanuj Singh Rathour\\Downloads\\my_downloads\\javaprojects\\newBankAccounts.csv";
	  List<String[]> newAccountHolders= utilities.CSV.read(file);
	  List<Account> accounts=new LinkedList<Account>();
	  for(String[] accountHolder:newAccountHolders) {
		  for(int i=0;i<accountHolder.length;i++) {
		     String name=accountHolder[0];
		     String sSN=accountHolder[1];
		     String accountType=accountHolder[2];
		     double amount=Double.parseDouble(accountHolder[3]);
//		     System.out.println(name+" "+sSN+" "+accountType+" "+amount);
		     
		     if(accountType.equals("Savings"))  accounts.add(new Savings(name,sSN,amount));
		     
		     else if(accountType.equals("Checking"))  accounts.add(new Checkings(name,sSN,amount));
		     
		     else  System.out.println("ERROR READING ACCOUNT TYPES");
	
		  }
	  }
	  
	 //getting the accounts values
	  for(Account acc:accounts) {
		  acc.showInfo();
		  System.out.println("*********************");
	  }
	   
  }
}
