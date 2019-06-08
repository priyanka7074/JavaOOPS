package OOPSConceptsPart1;

public class CallByValueAndCallByRef {
	int p,q;

	public static void main(String[] args) {
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		int x = 10;
		int y = 20;
		int v = obj.testSum(x, y);  //call by value or pass by value
		System.out.println("Call By Value");
		System.out.println(v); //v = 30
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		//After Swapping
		System.out.println("After swap");
		System.out.println("obj.p ="+obj.p);
		System.out.println("obj.q ="+obj.q);

	}
	
	public int testSum(int a, int b) {
		a=30; b=20;
		int c = a+b;
		return c;
	}
	
	//Call by ref -- Passing the value of obj ref 
	public void swap(CallByValueAndCallByRef t) {
		int temp;
		temp = t.p; //temp=50
		t.p = t.q;  //t.p=60
		t.q = temp; //t.q=50
		
		
	}

}
