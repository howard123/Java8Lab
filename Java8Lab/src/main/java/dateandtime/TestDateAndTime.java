package dateandtime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * This class is for testing java localdatetime. The new class improve on type
 * safe. This new class is immutible(thread-safe).
 * 
 * @author howard.suksanti
 *
 */
public class TestDateAndTime {

	LocalDateTime ldt = LocalDateTime.now();

	public void printLocalDate() {
		System.out.println(ldt);
	}

	public void printSecond() {
		System.out.println(ldt.getSecond());
	}

	public void printPlusWeek() {
		System.out.println(ldt.plusWeeks(1));
	}

	public void printTruncateSecond() {
		System.out.println(ldt.truncatedTo(ChronoUnit.SECONDS));

	}

	public static void main(String[] args) {
		TestDateAndTime td = new TestDateAndTime();

		td.printLocalDate();
		td.printSecond();
		td.printPlusWeek();
		td.printTruncateSecond();
	}
}
