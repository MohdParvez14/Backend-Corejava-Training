package Loops;
import java.util.Scanner;
public class PrimeNumLessthan100 {
	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Prime number less than 100 are :");
	 int n ,i;
	 for(n=2;n<=100;n++) {
	 for(i=2;i<=n-1;i++) 
			if(n%i==0)
				break;
		if(i==n)
			System.out.print( n+" ");
	}
  }
}
