package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class A1DateTimeClass {

	public static void main(String[] args) {
		//current date
		LocalDate myDate = LocalDate.now();

		System.out.println(myDate);

		//current time
		LocalTime myTime = LocalTime.now();

		System.out.println(myTime);

		//current date and time
		LocalDateTime myDateTime = LocalDateTime.now();

		System.out.println("before format :"+myDateTime);

		DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String modDateTime = myDateFormat.format(myDateTime);

		System.out.println("After format :"+modDateTime);


		System.out.println("before format :"+myDateTime);

		myDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		modDateTime = myDateFormat.format(myDateTime);

		System.out.println("After format :"+modDateTime);


		System.out.println("before format :"+myDateTime);

		myDateFormat = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss");
		modDateTime = myDateFormat.format(myDateTime);

		System.out.println("After format :"+modDateTime);

		System.out.println("before format :"+myDateTime);

		myDateFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		modDateTime = myDateFormat.format(myDateTime);

		System.out.println("After format :"+modDateTime);

		System.out.println();
		
		myDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String datestr = "26/01/2023";
		LocalDate date = LocalDate.parse(datestr,myDateFormat);
		System.out.println(date);
		
	}

}
