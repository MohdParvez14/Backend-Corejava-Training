package Loops;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = s.nextInt();
		int i;
		for(i=2;i<=n-1;i++) 
  		if(n%i==0)
				break;
		if(i==n)
			System.out.print("Prime Number");
		else
			System.out.print("Composite Number");
	}
}

