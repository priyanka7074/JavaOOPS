package OOPSConceptsPart2;

public class ConstructorWithThisKeyword {
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name,int age) {
		//Whenever you have to initialize the global variables with the local variables value 
		//we have to use this keyword in the constructor
		this.name = name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
		
		
		
	}

	public static void main(String[] args) {
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom",30);

	}

}
