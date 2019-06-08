package Questions;

public class PrimeNumber {
	//2 is the lowest prime no
	
	public static boolean isPrimeNo(int num) {
		
		//corner cases
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void getPrimeNo(int num) {
		
		for(int i=2;i<=num;i++) {
			if(isPrimeNo(i)) {
				System.out.println(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		
		System.out.println("2 is prime no: "+isPrimeNo(2));
		
		getPrimeNo(7);
		
		

	}

}
