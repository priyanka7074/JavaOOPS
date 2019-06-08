package Questions;

public class PalindromeNumber {
	
	//151
	//454
	//34543
	
	public static void isPalindromeNo(int num) {
		System.out.println("Given no is: "+num);
		int r = 0;
		int sum = 0;
		int temp;
		
		temp=num;
		while(num>0) {
			r = num%10;  //get the remainder
			sum=(sum*10)+r;
			num=num/10;
		}
		
		if(temp==sum) {
			System.out.println("Palindrome no");
		}
		else {
			System.out.println("Not a Palindrome no");
		}
	}

	public static void main(String[] args) {
		
		isPalindromeNo(152);


	}

}
