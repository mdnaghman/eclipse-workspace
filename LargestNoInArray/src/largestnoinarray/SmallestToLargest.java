package largestnoinarray;

public class SmallestToLargest {

	public static void main(String[] args) {
		
		int[] arr =  {44,3,56,21,10,9,8,22};
		
		int maxNumber = arr[0];
		
		for(int i = 0; i <arr.length; i++)
		{
			if(arr[i] > maxNumber)
			{
				maxNumber = arr[i];
				
			}
		}
		System.out.println("The Largest Number is: " +  maxNumber);
	}
}