package recursion;

public class Message {
	
	public static void main(String[] args) {
		// write a function that print hello world
		message();
	}

	private static void message() {
		System.out.println("Hello world!");
		message1();
	}

	private static void message1() {
		System.out.println("Hello world!");
		message2();
	}

	private static void message2() {
		System.out.println("Hello world!");
		message3();
	}

	private static void message3() {
		System.out.println("Hello world!");
		message4();
	}

	private static void message4() {
		System.out.println("Hello world!");
	}

}
