package OOPSConceptsPart2;

public class HSBCBank implements USBank, BrazilBank { //Achieving multiple inheritance. Also called as "Is-A-Relation"
	
	//if a class is implementing on any interface, then its mandatory to define/override all the methods of interface
	
	//overriding from USBank
	public void credit() {
		System.out.println("hsbc -- credit");
	}
	
	public void debit() {
		System.out.println("hsbc -- debit");
	}
	
	public void transferMoney() {
		System.out.println("hsbc -- transferMoney");
	}
	
	//separate methods of HSBC Bank
	public void educationLoan() {
		System.out.println("hsbc -- education Loan");
	}
	
	public void carLoan() {
		System.out.println("hsbc -- car Loan");
	}
	
	//overriding from BrazilBank
	public void mutualFund() {
		System.out.println("hsbc -- mutual fund");
	}

	

}
