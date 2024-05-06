package Arrays;
import java.util.Scanner;
public class Count_Distt_Element {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int count=0;
	for(int i=0;i<n;i++) {
	int j=0;
	  for(j=0;j<i;j++) {
		 if(arr[i]==arr[j])
			break;
	}
	if(i==j)
		count++;
	}
	System.out.println(count);
}
}
