package Arrays;
import java.util.Scanner;
public class subarray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int [] arr = new int[x];
		for(int i=0;i<x;i++) {
			arr[i]= sc.nextInt();
		}
		pairs(arr);
}
public static void pairs(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++)
			System.out.print("("+arr[i] +","+ arr[j]+")");
	
	System.out.println();
	}
	
	
}
}
