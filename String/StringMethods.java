package String;
public class StringMethods {
	public static void main(String[] args) {
//		String length Method
		String str = "Mohd Parvez";
		System.out.println("Given String length is : "+ str.length());
//		CharAt Method
		String str1 = "Parvez";
		char ch = str1.charAt(2);
		System.out.println("character present at index 2 is : "+ ch);
//		Lowercase and Uppercase Method
		String str2 = "Mohd Parvez";
		System.out.println("Lowercase : "+str.toLowerCase());
		System.out.println("Uppercase : "+str.toUpperCase());
//		Concatenation Method
//		Using "+" operator
		String s3 = "Railworld";
		String s4 = "India";
		System.out.println("After Concatenation : " + s3 +" " + s4);
//		using .concat() method
		System.out.println("After Concatenation : " + s3.concat(s4));
// 		trim() Method
		String s1 = "   New Delhi";
		System.out.println("Original String :" + s1);
		System.out.println("After Trim :" + s1.trim());
//		join() Method
		String s5 = "I";
		String s6 = "Love";
		String s7 = "India";
		String joinedstring = String.join("-",s5,s6,s7);
		System.out.println("After Joining : "+joinedstring);
	}
}
