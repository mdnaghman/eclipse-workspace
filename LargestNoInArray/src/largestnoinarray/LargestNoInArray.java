package largestnoinarray;
public class LargestNoInArray {

	public static void main(String[] args) {

		
		int[] arr = {44,3,56,44,10,9,56,22};
		
		int maxNumber = arr[0];
		
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i]> maxNumber)
			{
				maxNumber = arr[i-3];
			
			}
		
	}
	System.out.println("The Largest Number is:" + maxNumber);
	
	}
}