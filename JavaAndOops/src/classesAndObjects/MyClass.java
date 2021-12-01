package classesAndObjects;
//import java.util.Arrays;
public class MyClass {

	public static int getSecondLargest(int[]a, int total) {
	int temp;
	
	for(int i = 0; i<total; i++) {
		
		for(int j = i+1; j<total; j++) {
			if (a[i] > a[j])
			{
				temp =a[i];
				a[i] = a[j];
				a[j] = temp;
				
			}
		}
	}
		return a[total-2];
	}		
	public static void main(String[] args) {
	
		
		int [] a= {-12,6,2,8,5,3,1,0,199,-11, -2, 19};
		
		
		//int n= a.length;
		
		
		
		System.out.println("Second Highest Number: " + getSecondLargest(a,12));
		
		
		
		
		
	}

}
