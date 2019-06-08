package Questions;

public class StringSwap {

	public static void main(String[] args) {
		
		String a = "hello";
		String b = "world";
		System.out.println("Before swapping:");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		//1. Append a and b
		a = a+b; //helloworld
		
		//2. store initial string a in string b
		b=a.substring(0, a.length()-b.length());
		
		//3. store initial string b in string a
		a=a.substring(b.length());
		
		System.out.println("After swapping:");
		System.out.println("a: "+a);
		System.out.println("b: "+b);

	}

}
