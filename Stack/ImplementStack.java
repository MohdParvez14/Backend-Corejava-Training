package Stack;
import java.util.Stack;
public class ImplementStack {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
        s.push("ankit");
        s.push("ankita");
        s.push("ashu");
        s.push("vinit");
        s.push("anshika");
        s.push("ram");
        System.out.println(s);
        s.pop();
        System.out.println(s.empty());
        System.out.println(s.peek());
        System.out.println(s.search("ankitas"));

	}

}
