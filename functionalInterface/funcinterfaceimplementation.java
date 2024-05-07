package functionalInterface;
public class funcinterfaceimplementation {
@FunctionalInterface
	interface MessagePrinter { //abstract method
		void Message(String message);
		}
public class Main {
	public static void main(String[] args) {
// Implementing the functional interface using a lambda expression
		MessagePrinter printer = message -> System.out.println("Message: " + message);
		        
// Using the implemented method
		printer.Message("Hello, world!"); // Output: Message: Hello, world!
		    }
		}
	}

