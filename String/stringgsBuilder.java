package String;
import java.util.*;
public class stringgsBuilder {
	public static void main(String[] args) {
	StringBuilder str = new StringBuilder("Railworld");
	System.out.println("String = " +str);
	//setCharAt() method
	str.setCharAt(0,'W');
	System.out.println("After charSetAt() String = " +str);
	//Append() method
	str.append("India Pvt Ltd");
	System.out.println("After append = " + str);
	
	StringBuilder sb = new StringBuilder("Hindustan");
	System.out.println("String = "+sb);
	//insert() method
	//insert int
	sb.insert(3, 6);
	System.out.println("After insert() = "+sb);
	//insert char
	sb.insert(6, 'm');
	System.out.println("After insert() = "+sb);
	//insert boolean
	sb.insert(11, true);
	System.out.println("After insert() = "+sb);
	//deleteCharAt() method
	StringBuilder str1 = new StringBuilder("Fullstack");
	System.out.println("Orgnl String = "+str1);
	str1.deleteCharAt(3);
	System.out.println("After deleteCharAt() = "+str1);
	str1.delete(1, 3);
	System.out.println("After delete() = "+str1);
	//reverse() method
	str1.reverse();
	System.out.println("After reverse = "+str1);
	StringBuilder str2 = new StringBuilder();
//	str2.capacity();    e
	System.out.println("Capacity() = "+str2.capacity());
	}
  
}
