package interviewProblems;

public class MathematicForCP {

	public static void main(String[] args) {
		
		System.out.println(fastPower(34,6));
		
	}
	
	static int fastPower(int a, int b) {
		
		int res = 1;
		
		while (b>0) {
			
			if ((b&1) !=0) {
				res = res *a;
			}
			a =  a*a;
			b =  b>>1;
			
		}
		return res;
		
	}
//	static int gcd(int a, int b) {
//		return a%b == 0? b:gcd(b. a%b);
 	}


