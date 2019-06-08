package Questions;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "the rains have started here";
		String str1 = "the rains Have started here";
		
		System.out.println(str.length()); //27
		
		System.out.println(str.charAt(5)); //a
		
		System.out.println(str.indexOf('s')); //8
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1)); //15 -- start counting from 9th index
		
		System.out.println(str.indexOf("have")); //10
		
		System.out.println(str.indexOf("hello")); //-1. This string is not present hence returning -1
		
		System.out.println(str.equals(str1)); //false since H is upper case . It is case sensitive also so if its not exactly same
		
		System.out.println(str.equalsIgnoreCase(str1));//true
		
		System.out.println(str.substring(0, 9)); //get the partial string
		
		//trim
		String s = "    Hello World     ";
		
		System.out.println(s.trim()); //It will trim before space and after space hence Hello World will be printed
		
		System.out.println(s.replace(" ", "")); //HelloWorld without any between space is printed
		
		String date = "01-01-2018";
		
		System.out.println(date.replace("-", "/")); //Replace - with / in the date.
		
		//split
		String test = "Hello_World_Test_Selenium";
		
		String testval[] = test.split("_");
		
		for(int i=0;i<testval.length;i++) {
			System.out.println(testval[i]);
		}
		
		
		//concatenation
		String s2="cares";
		
		System.out.println(s2.concat("s"));//caress
		
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		
		System.out.println(x+y); //HelloWorld
		System.out.println(a+b); //300
		System.out.println(x+y+a+b);  //HelloWorld100200
		System.out.println(a+b+x+y);  //300HelloWorld
		System.out.println(x+y+(a+b));  //HelloWorld300
		
		
		
		

	}

}
