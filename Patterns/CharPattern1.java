package Patterns;                           //Print the Pattern
import java.util.Scanner;                   //ABCD
public class CharPattern1 {                 //ABCD
	public static void main(String[] args) {//ABCD
		Scanner s = new Scanner(System.in); //ABCD
		int n = s.nextInt();
		for(int i =1;i<=n;i++) 
		{	
			for(int j=1;j<=n;j++) 
			{	
				System.out.print((char)(('A'+j)-1));
			}
			System.out.println();
		}
	}
}
