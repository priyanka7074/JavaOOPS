package AbstractionConcept;

public abstract class Bank {
	
	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;
	
	//partial abstraction is achieved
	//Hiding the implementation logic is called abstraction
	//abstract class can have abstract methods as well as non abstract methods
	//cannot create the object of abstract class
	
	
	public abstract void Loan(); //abstract method -- no method body
	
	
	//non abstract methods
	public void Credit() {
		System.out.println("Bank --- credit");
	}
	
	
	public void Debit() {
		System.out.println("Bank --- Debit");
	}
	

}
