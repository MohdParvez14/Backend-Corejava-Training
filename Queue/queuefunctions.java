package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class queuefunctions {
	public static void main(String[] args) {
		 Queue<String> queue = new LinkedList<>();

		    //queue.offer function helps in adding elements in queuee
		     queue.offer("Shrashti");
		     queue.offer("vaibhav");
		     queue.offer("vikas");
		     queue.offer("vedant");
		     queue.offer("parvez");
		     queue.offer("vimal");

		     System.out.println("Queue: " +queue);
		     //poll() function removes and returns the element ata the front of the queue.If the queue is empty, it returns null.
		     System.out.println("Poll Method "+ queue.poll());
		     System.out.println("Queue: " +queue);
		     //peek() function tells which elements is next in line for coming out, if the queue is empty return null
		     System.out.println(queue.peek());

		     //add() functions tells insert the specified element into the queue. If the task is successful add() returns true, if not it throws an exception
		     queue.add("shri");
		     System.out.println("Queue: " +queue);

		     //element() function returns the head of the queue.Throws an exception if the queueu is empty.
		     System.out.println(queue.element());

		     //remove() function returns and removes the head of the queueu.Throws an exception if the queueu is empty
		     System.out.println("Removed element: " + queue.remove());
		     System.out.println("Queue: " +queue);
	}
}
