package Algorithms;


public class insertionSort {

	public static void main(String[] args) {
		
		int a[]= {20,8,4,1,5,9,2};
		int n= a.length;
		
		for (int i = 1; i<n; i++ ) {
			int temp = a[i];
			int j= i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
			
			
			}
		for(int e:a) {
			System.out.println(e+",");
		}
		}
	

	}


