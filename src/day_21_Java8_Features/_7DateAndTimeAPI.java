package day_21_Java8_Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * Java 8 introduced a new Date and Time API (java.time) to replace the outdated java.util.Date and java.util.Calendar. 
 * The new API is immutable and thread-safe.
 */
public class _7DateAndTimeAPI {
	public static void main(String[] args) {
        // Current date
        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);

        // Current date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTime);

        // Format date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatted date and time: " + dateTime.format(formatter));
    }
}
