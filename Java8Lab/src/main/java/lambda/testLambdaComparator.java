package lambda;

import java.util.Collections;
import java.util.List;

public class testLambdaComparator {

	public static void main(String[] args) {

		List<Person> testList = Person.createShortList();

		for (Person p : testList) {
			p.printName();
		}

		Collections.sort(testList, (Person p1, Person p2) -> p1.getSurName()
				.compareTo(p2.getSurName()));

		for (Person p : testList) {
			p.printName();
		}

	}

}
