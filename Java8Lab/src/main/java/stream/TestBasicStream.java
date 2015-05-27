package stream;

import java.util.ArrayList;
import java.util.List;

public class TestBasicStream {

	public TestBasicStream() {
		createRoster();
	}

	List<Person> group;

	private void createRoster() {
		Person rob = new Person();
		rob.setName("Robert");

		Person kevin = new Person();
		kevin.setName("Kevin");

		Person charles = new Person();
		charles.setName("Charles");

		group = new ArrayList<Person>();
		group.add(rob);
		group.add(kevin);
		group.add(charles);

	}

	// test print all with foreach
	public void printAllForEach() {

		for (Person p : group) {
			System.out.println(p.getName() + " foreach ");
		}
	}

	// test with new Java 8 stream

	public static void main(String[] args) {

		new TestBasicStream().printAllForEach();
	}

}
