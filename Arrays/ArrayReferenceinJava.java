package Arrays;
 import java.util.Arrays;
import java.util.Iterator;
   import java.util.Scanner;
      public class ArrayReferenceinJava {
	     
    	  static void printArray(int[] arr) {
		    for(int i=0; i<arr.length; i++) {
		 	 System.out.print(arr[i] + " ");
		     }
		    System.out.println();
	    }

      	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the size of array: ");
		//int n = sc.nextInt();
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 7;
		arr[3] = 8;
		arr[4] = 9;
		
//		System.out.println("Enter" + n +_ "elements");
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.nextInt();	
//	}
		System.out.println("Original array: ");
		printArray(arr);
		
		//trying to copy arr to arr_2
		//int[] arr_2 = arr; //shallow copy
	// Cloning of array	
		//int[] arr_2 = arr.clone();
	// Method 1	
		//int[] arr_2 = Arrays.copyOf(arr, 3);
	// Method 2	
		int[] arr_2 = Arrays.copyOfRange(arr, 0,4);
		System.out.println("Copied array: ");
		printArray(arr_2);
		 
		//changing some values of arr_2
//		arr_2[0] = 0;
//		arr_2[1] = 0;
//		
//		System.out.println("Original array after changing arr_2");
//		printArray(arr);
//		
//		System.out.println("Copied arr_2 after changing arr_2");
//		printArray(arr_2);

	}

}
