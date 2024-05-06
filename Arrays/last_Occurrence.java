package Arrays;
import java.util.Scanner;
import java.util.Iterator;

public class last_Occurrence {
	
	static int lastOccurrences(int[] arr, int x) {
		int lastindex = -1;
		for(int i=0; i<arr.length; i++)
			if(arr[i]==x)
				lastindex = i;
		return lastindex;
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Enter x: ");
		int x = sc.nextInt();
		
		System.out.println("Last Occurrence of " + x +" : " + lastOccurrences(arr, x));
		
		
		
	}

}
