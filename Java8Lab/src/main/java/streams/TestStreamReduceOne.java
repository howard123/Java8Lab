package streams;

import java.util.Arrays;

public class TestStreamReduceOne {

	public static void main(String[] args) {

		Integer[] numbers = {1, 3, 5, 7, 9, 11};

		int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);

		System.out.println("Total sum is :" + sum);
	}
}
