package String;
import java.util.*;
public class equalsAndcomaparatormethod {
	public static void main(String[] args) {
		String s1 = "hello"; //address = 400
		String s2 = "hello"; //address = 400
		String s3 = new String("hello");
		
		//equals method
	    System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));//output:true bcz it also match string character by character if address is changed
		
		// comparator or == method
		System.out.println(s1==s2);
		System.out.println(s1==s3);//output:false bcz it works only on address
	}

}
