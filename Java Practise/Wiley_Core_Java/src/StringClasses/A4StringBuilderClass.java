package StringClasses;

public class A4StringBuilderClass {

	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("Wiley");	
//		sb.append(" Edge");

		//methods same as StringBuffer
		//"[timestamp] user userId : logged in successfully]"
		StringBuilder logMessage = new StringBuilder();
		
		long timestamp = System.currentTimeMillis();
		logMessage.append("[")
			      .append("timestamp")
				  .append("] ");
		
		int userId = 123456;
		logMessage
		.append("User ")
		.append(userId)
		.append(": ");
		
		String message = "login SuccessFully";
		logMessage.append(message);
		
		System.out.println(logMessage);
			
		
		
		
	}

}
