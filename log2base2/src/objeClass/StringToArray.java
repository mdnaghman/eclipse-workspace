package objeClass;

public class StringToArray {

	public static void main(String[] args) {
		
		String s = "naghman";
		
		char[] ch = s.toCharArray();
		
		for(int i =0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
	}

}
