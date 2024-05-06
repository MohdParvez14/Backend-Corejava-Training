package Patterns;
import java.util.Scanner;
public class SolidSquarePattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();  // for Rows
		int m = s.nextInt();  // for Columns
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print("*");
			}
			System.out.println();//for next line after printing one row
		}
	}
}