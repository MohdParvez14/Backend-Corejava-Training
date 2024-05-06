package Arraylist;
import java.util.ArrayList;
public class Implementarraylist {

	public static void main(String[] args) {
		 ArrayList<String> al1 = new ArrayList();
	        al1.add("apeksha");
	        al1.add("aastha");
	        al1.add("anjali");
	        al1.add("riya");
	        al1.add("payal");

	        System.out.println(al1);//[apeksha, anjali, riya, payal]
	        System.out.println(al1.size());//4
	        System.out.println(al1.get(3));//riya
	        System.out.println(al1.set(2, "anjali"));//anjali
	        System.out.println(al1.contains("aastha"));//false
	        System.out.println(al1.contains("riya"));//true
	        al1.remove(1);//[apeksha, anjali, riya, payal]
//	        al1.clear();
//	        System.out.println(al1);
	        System.out.println(al1.indexOf("payal"));//3

	        ArrayList<String> al2 = new ArrayList();
	        al2.add("arpita");
	        al2.add("aastha");
	        al2.add("aman");

	        al1.addAll(al2);//[apeksha, anjali, riya, payal, arpita, amit, aman]
	        System.out.println(al1);
	         al1.removeAll(al2);
	         System.out.println(al1);


	}

}
