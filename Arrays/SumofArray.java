package Arrays;

public class SumofArray {

	public static void main(String[] args) {
		int[] arr = {1,4,5,6,1};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			sum = sum + arr[i];
		}
		System.out.println("Sum of elements of array: " + sum);
		

	}

}
