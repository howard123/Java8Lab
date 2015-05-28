package dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
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

	// This method is testing on plusWeeks Api method
	public void printPlusWeek() {
		System.out.println(ldt.plusWeeks(1));
	}

	// This method will truncate the time format till second
	public void printTruncateSecond() {
		System.out.println(ldt.truncatedTo(ChronoUnit.SECONDS));

	}

	public void printLocalDateOf() {
		System.out.println(LocalDate.of(2012, Month.DECEMBER, 12));
	}

	public void testPeriod() {
		// Period will take an 3 parameter year , month, day
		Period period = Period.of(0, 0, 10);
		System.out.println("This moment plus 10 days is" + ldt.plus(period));

		Period period2 = Period.of(0, 1, 0);
		System.out.println("This moment plus 1 month is" + ldt.plus(period2));
	}

	public static void main(String[] args) {
		TestDateAndTime td = new TestDateAndTime();

		td.printLocalDate();
		td.printSecond();
		td.printPlusWeek();
		td.printTruncateSecond();

		td.printLocalDateOf();
		td.testPeriod();
	}
}
