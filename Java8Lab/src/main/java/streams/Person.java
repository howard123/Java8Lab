package streams;

import java.time.LocalDate;

public class Person {

	public enum Sex {
		MALE, FEMALE
	}

	String _name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;
	int _age;

	// ...

	public int getAge() {
		// ...
		return _age;
	}
	public void setAge(int age) {
		_age = age;
	}

	public String getName() {
		// ...
		return _name;
	}
	public void setName(String name) {
		_name = name;
	}

	public static void main(String[] args) {
		System.out.println("test");
	}

}
