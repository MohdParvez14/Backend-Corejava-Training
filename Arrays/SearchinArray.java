package Arrays;
import java.util.Scanner;
public class SearchinArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element you want to search in array:");
		int x= sc.nextInt();
		//Linear Search
		int[] arr = {5,3,6,2,8,4,2};
		//int x=8;
		int ans = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				ans=i;
				break;
			}
		}
		System.out.println("Found "+ x +" at index : " + ans);
	}
}

