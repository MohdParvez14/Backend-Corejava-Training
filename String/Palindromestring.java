package String;
import java.util.*;
public class Palindromestring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
	//Normal Approach
//		StringBuilder gtr = new StringBuilder(str);
//		gtr.reverse();
//		String s = gtr + "";
//		// we cannot give StringBuilder inside a string
//		// that's why we have add a space in  StringBuilder
//		if(str.equals(s)) {
//		System.out.println("palindrome");
//		}
//	else
//			System.out.println("not palindrome");
		
	//Two Pointer Approach
		//it is completed in O(n) operation
		//we have not define any extra string here
		int i=0;
		int j=str.length()-1;
		boolean flag=true; // true -> palindrome
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				flag = false;
				break;
			}
			i++;
		    j--;		
		}
		if(flag==true) 
			System.out.println("palindrome");
		else
			System.out.println("Not palindrome");		
  }
} 
