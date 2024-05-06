package Loops;
import java.util.Scanner;
public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int rev = 0;
		int orig = n;
		while(n>0) {
			//To get the last digit or remainder
		    int rem = n%10;
			rev = rev*10+rem;
			//To remove last digit
			n = n/10;
		}
		if(orig==rev) {
			System.out.println("It is a Palindrome Number");
		}
		else {
			System.out.println("It is not a Palindrome Number");
		}
    }
}