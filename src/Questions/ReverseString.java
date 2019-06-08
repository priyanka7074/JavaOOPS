package Questions;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Selenium";
	
		//1. Using for loop
		int len = s.length();//8
		
		String rev = "";
		
		for(int i=len-1;i>=0;i--) {
			rev = rev + s.charAt(i); //mu
			
		}
		
		System.out.println(rev);
		
		//2. Using String buffer class 
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());

	}

}
