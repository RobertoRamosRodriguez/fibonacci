package es.roberto.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class FibonacciService {

	private static final int F0 = 0;
	private static final int F1 = 1;

	public List<Integer> getFibonacci(final int sizeOfList) {
		List<Integer> response = new ArrayList<>();

		for (int i = 0; i < sizeOfList; i++) {
			response.add(this.getNumber(i));
		}

		return response;
	}

	private int getNumber(final int number) {
		switch (number) {
		case F0:
		case F1:
			return number;
		default:
			return this.getNumber(number - 1) + this.getNumber(number - 2);
		}

	}

}