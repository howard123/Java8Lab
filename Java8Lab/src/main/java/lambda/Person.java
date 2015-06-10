package lambda;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String givenName;
	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private String surName;
	private int age;
	private Gender gender;
	private String email;
	private String phone;
	private String address;

	public enum Gender {
		male, female
	};

	public void printName() {
		System.out.println(getGivenName());
	}

	public static List<Person> createShortList() {

		List<Person> lists = new ArrayList<>();

		// add Person a
		Person a = new Person();
		a.setGivenName("andre");
		a.setSurName("kate");

		// create Person b
		Person b = new Person();
		b.setGivenName("brook");
		b.setSurName("jenn");

		Person c = new Person();
		c.setGivenName("charlotte");
		c.setSurName("bate");

		lists.add(a);
		lists.add(b);
		lists.add(c);

		return lists;
	}

}
