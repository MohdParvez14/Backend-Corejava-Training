package String;
import java.util.*;
public class ReverseWordInSentenceOfString {
	public static void main(String[] args) {
	String str = "I am a Software Developer";
	String ans = "";
	StringBuilder sb =  new StringBuilder("");
	for(int i=0; i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch!=' '){
			sb.append(ch);
		}
		else{ // ch=' '
			sb.reverse();
			ans += sb;
			ans += " ";
//			sb.delete(0, str.length());
			sb = new StringBuilder("");
		}
	}
	System.out.println(sb); // last word is is sb but it isn't printed bcz 
	//there is no space after that so we have to add space in ans , reverse it
	//and add sb in ans.
	
	sb.reverse();
	ans += sb;
	System.out.println(ans);
	}
}
