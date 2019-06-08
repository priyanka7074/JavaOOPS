package OOPSConceptsPart2;

public class ThrowKeyword {
	
	//throw exception is a user defined exception on the basis of any condition

	public static void main(String[] args) {
		
		
		System.out.println("ABC");
		
		try {
			throw new Exception("Priyanka Exception");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("PQR");
		
		String Exec_Flag = "N";
		
		if(Exec_Flag.equals("N")) {
			try {
				throw new Exception("Execution flag is not an exception");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
