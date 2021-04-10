package GitTest;

public class Test1 {
	
	public static void main(String[] args) {
		
		String Name = "Rajesh";
		
		char[] n = Name.toCharArray();
		String Reverse="";
		
		for (int i = n.length-1; i >=0; i--) {
			Reverse=Reverse+n[i];
	//		System.out.println(n[i]);
	
		}
		System.out.println(Reverse);
	}
}

