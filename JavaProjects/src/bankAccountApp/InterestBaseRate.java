package bankAccountApp;

public interface InterestBaseRate {

	
	//find a method that returns the base rate 
	  default double getBaseRate() {
		  return 2.5;
	  }
}
