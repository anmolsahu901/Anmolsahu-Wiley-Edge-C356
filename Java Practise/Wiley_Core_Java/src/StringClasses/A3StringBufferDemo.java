package StringClasses;

public class A3StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer chatHistory = new StringBuffer();
		
		String sender = "venkat";
		String message = "Hey Sachin!";
		
		chatHistory.append(sender);
		chatHistory.append(": ");
		chatHistory.append(message);
		chatHistory.append("\n");
		
		sender = "Sachin";
		message = "hello venkat!";
		
		chatHistory.append(sender);
		chatHistory.append(": ");
		chatHistory.append(message);
		chatHistory.append("\n");
		
		System.out.println(chatHistory);
		
	}

}
