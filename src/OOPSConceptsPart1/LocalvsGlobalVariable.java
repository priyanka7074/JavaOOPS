package OOPSConceptsPart1;

public class LocalvsGlobalVariable {
	
	//Global/Class variables
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		int i = 10;  //local variables of main method
		System.out.println(i);
		
		LocalvsGlobalVariable obj = new LocalvsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
		

	}
	
	public void sum() {
		int i = 15;   //i,j,age are local variables of sum method
		int j = 20;
		
	}

}
