package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank hb = new HDFCBank();
		
		hb.Credit();
		hb.Debit();
		hb.Loan();
		hb.Funds(); //It is HDFC bank personal method and cannot be accessed by Bank class hence b.funds is not available
		
		System.out.println("*********");
		Bank b = new HDFCBank();
		b.Loan();
		b.Credit();
		b.Debit();
		
		
		
		

	}

	
}
