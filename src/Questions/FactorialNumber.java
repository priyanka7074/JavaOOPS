package Questions;

public class FactorialNumber {
	//fact of 3 = 3*2*1 = 6
	//fact of 4 = 4*3*2*1 = 24
	//fact of 0 = 1
	
	//1. Without recursive -- for loop
	public static int factorial(int num) {
		int fact=1;
		if(num==0) {
			return 1;
		}
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		return fact;
		
	}
	
	//2. With recursive function -- fn calling itself
	
	public static int fact1(int num) {
		
		if(num==0) {
			return 1;
		}
		else {
			return (num * fact1(num-1));
		}
	}
	


	public static void main(String[] args) {
		
		//System.out.println(factorial(0)); 
		System.out.println(fact1(6));

	}

}
