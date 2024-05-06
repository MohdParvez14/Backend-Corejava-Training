package Arrays;
import java.util.Scanner;
public class CountOccurence {
	public static void main(String[] args) {
		
		//int x;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		//System.out.println("Enter the number for countOccurence: ");
		System.out.println("Enter the number check for strictly greater: ");
		int x = sc.nextInt();
		
		for(int i=0; i<n; i++)
			//if (arr[i]==x) 
			if (arr[i]>x) {
				count++;
			}
		
		//System.out.println("Frequency of x is : " + count);
		System.out.println("Greater number than "+ x +" is: " + count);
	}

}
