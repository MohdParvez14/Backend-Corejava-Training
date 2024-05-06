package Arrays;
import java.util.Scanner;
import java.util.Arrays;
	public class Smallestandlargest {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	
			System.out.println("Enter the size of array: ");
			int n = sc.nextInt();
	
			int [] arr = new int[n];
			System.out.println("Enter " + n + " elements: ");
			for(int i=0; i<n; i++)
				arr[i] = sc.nextInt();
			
			
//			Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
//			}
			System.out.println();
//			
//			int[] ans = {arr[0], arr[arr.length-1]};
//			System.out.println("Smallest : " + ans[0]);
//			System.out.println("Largest : " + ans[1]);
}
	}}

