package Patterns;                            //Print Inverted Half Pyramid
public class InvertedPyramid {               //   *
	public static void main(String[] args) { //  **
		int n=4;                             // ***
		//Outer Loop                         //****
		for(int i=1;i<=n;i++) {
			//Inner Loop -> Space Print
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//Inner Loop -> Print star
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
