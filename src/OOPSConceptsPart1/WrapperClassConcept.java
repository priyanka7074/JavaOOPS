package OOPSConceptsPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x = "100";
		System.out.println(x+20); //10020 -- String concatenation
		
		int i = Integer.parseInt(x); //data conversion from string to integer
		System.out.println(i+20); //120 -- Addition
		
		//Integer, double, char, boolean are all having wrapper classes
		
		//String to double
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10); //22.33
		
		//String to boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);  //true
		
		//Int to string
		int j = 200;
		String s = String.valueOf(j);
		System.out.println(s+20); //20020
		
		String u = "100A"; //NumberFormatException is thrown for InputString
		int o = Integer.parseInt(u);
		System.out.println(o);
		
		

	}

}
