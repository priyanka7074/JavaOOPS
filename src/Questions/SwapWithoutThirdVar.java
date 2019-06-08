package Questions;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		
		int x=5;
		int y=10;
		
		//1. Using third variable
		 int t;
		 t=x;
		 x=y;
		 y=t;
		 
		 System.out.println(x);
		 System.out.println(y);
		 
		 //2. Without third variable
		 x = x+y; //15
		 y = x-y; //15-10=5
		 x = x-y; //15-5=10
		 
		 System.out.println(x);
		 System.out.println(y);
		 
		 //3. Using * operator
		 
		 x=x*y; //50
		 y=x/y; //5
		 x=x/y; //10
		 System.out.println(x);
		 System.out.println(y);
		 
		 //4.using XOR operator
		 
		 x=5;//0101
		 y=10;//1010
		 
		 x=x^y; //15 (1111)
		 y=x^y; //10
		 x=x^y; //5
		 
		 System.out.println(x);
		 System.out.println(y);
	
	}

}
