package Questions;

public class RemoveJunk {

	public static void main(String[] args) {
		String s = "abc 华语／華語 xyz08765";
		
		//regular expressions must be used : [^a-zA-Z0-9]
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		

	}

}
