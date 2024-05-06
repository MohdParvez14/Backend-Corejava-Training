package Patterns;                                 // Print the pattern
public class HalfPyramidWithNumbers {             //1
	public static void main(String[] args) {      //1 2
		int n = 5;                                //1 2 3
		for(int i=1;i<=n;i++) {                   //1 2 3 4
			for(int j=1;j<=i;j++) {               //1 2 3 4 5
				System.out.print(j+" ");
			}
		System.out.println();
		}
	}
}
