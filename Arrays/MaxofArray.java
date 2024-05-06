package Arrays;

public class MaxofArray {

	public static void main(String[] args) {
		int[] arr = {2, 5, 3, 6, 4, 9};
		int ans = 0;
		for(int i=0; i<arr.length; i++)
			if(arr[i]>ans)
				ans=arr[i];
		System.out.println("Maximum element is: "+ ans);

	}

}
