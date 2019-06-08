package Questions;

public class ArmstrongNumber {
	
	//153 = (1*1*1)+(5*5*5)+(3*3*3)
	//407
	
	public static void isArmstrongNo(int num) {
		System.out.println("Given no is: " +num);
		int r=0;
		int cube=0;
		int temp;
		
		temp=num;
		
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
			
		}
		
		if(temp==cube) {
			System.out.println("Is Armstrong no");
		}
		else {
			System.out.println("Not a Armstrong no");
		}
		
	}

	public static void main(String[] args) {
		
		isArmstrongNo(153);
		

	}

}
