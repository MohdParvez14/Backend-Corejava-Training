package String;
import java.util.*;
public class printAllSubStrings {
	public static void main(String[] args) {
		String str = "abcd";
		for(int i=0; i<=3; i++) {
			for(int j=i+1; j<=4; j++)
				System.out.print(str.subSequence(i, j) + " ");
		}}}
//      String s="Hello";
//      s="Dello";
//      System.out.println(s);
//	}
//}
