package Algorithms;

public class bubbleSort {

	public static void main(String[] args) {
		
		int array[]= {2,1,8,-3,6,4,12,34,500,6000};
		
		int number = array.length;
		
		for(int i=0; i < number-1; i++){
			
			boolean sorted =true;
			
			for(int j=0; j<number-1-i; j++) 
			{
				
			if(array[j+1] < array[j]) {
				
				int temp= array[j+1];
				array[j+1] = array[j];
				array[j] = temp;
				
				sorted = false;
			}
		}
			if (sorted) break;
	}
			for(int item:array)
			{
				System.out.print(item+ ", ");
			}
	}
}