package linkedlist;
import java.util.LinkedList;
public class LinkedlistImplementation {

	public static void main(String[] args) {
		LinkedList <String> l1 = new LinkedList();
        l1.add("deepak");
        l1.add("ram");
        l1.add("shyam");
        l1.add("priya");
        System.out.println(l1);//[deepak, ram, shyam, priya]
        
        l1.addFirst("aarav");//[aarav, deepak, ram, shyam, priya]
       System.out.println(l1);
       
        l1.removeFirst();
        System.out.println(l1); //[deepak, ram, shyam, priya]  
        
        System.out.println(l1.getFirst());//deepak
        
       LinkedList <String> l2 = new LinkedList();
        l2.add("jayshree");
        l2.add("mohini");
        l2.add("kavita");
        l2.add("payal");
        System.out.println(l2);//[jayshree, mohini, kavita, payal]
        
       l2.addLast("aarti");//[jayshree, mohini, kavita, payal, aarti]
       System.out.println(l2);
        
        l2.removeLast();
        System.out.println(l2);//[jayshree, mohini, kavita, payal]
       
        System.out.println(l2.getLast());//payal

	}

}
