package interviewProblems;
import java.util.*;

public class NonRepeatingelement {
	
	static int singleNumber(int[] nums, int n) {
		HashMap<Integer, Integer> m= new HashMap<>();
		long sum1= 0, sum2= 0;
		for (int i=0; i<n; i++) {
			if (!m.containsKey(nums[i])) {
				sum1 += nums[i];
				m.put(nums[i], 1);
			}
			sum2 += nums[i];
			
			}
		return (int) (2*(sum1) - sum2);
		
		}
	

	public static void main (String[] args) {
		
		int[] a= {2,3,4,5,5,3,4};
		int n= 7 ;
		System.out.println(singleNumber(a,n));
		
		
	}
}
