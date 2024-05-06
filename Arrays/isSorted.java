package Arrays;

import java.util.Scanner;

public class isSorted {
	static boolean isSorted(int[] arr) {
		boolean check = true;
	/*  i = 0
		arr[0] < arr[0-1]
		arr[0] < arr[-1]
	    as we know -1 index doesn't exist in the array 
	    hence it will give the error */
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<arr[i-1]) {
				check = false;
				break;
			}		
		}
		return check;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		
		System.out.println("Is sorted: " + isSorted(arr));
		
	}

}
