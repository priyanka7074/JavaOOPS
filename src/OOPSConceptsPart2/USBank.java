package OOPSConceptsPart2;

public interface USBank {
	
	int min_bal = 100;
	public void credit();
	public void debit();
	public void transferMoney();
	
	//Only method declaration is allowed. No method body.
	//Variable declaration is allowed and they are static in nature
	//Variable values cannot be changed and are final/constant in nature.
	//no static method is allowed
	//no main method
	//we cannot create the object of an interface. They are abstract in nature.
	

}
