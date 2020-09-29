package es.roberto.fibonacci;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FibonacciServiceTest {

	private final static List<Integer> FIBONACCI_LIST = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233);

	private FibonacciService service = new FibonacciService();

	@ParameterizedTest
	@ValueSource(ints = { 3, 5, 10, 14 })
	public void givenNumberOfElementsWhenExecuteFibonacciThenReturnCorrectResult(final int numberOfElements) {
		List<Integer> listResult = this.service.getFibonacci(numberOfElements);
		List<Integer> listExpected = FIBONACCI_LIST.subList(0, numberOfElements);

		// @formatter:off
		assertAll(() -> assertNotNull(listResult, () -> "The list should be not null"),
		          () -> assertFalse(listResult.isEmpty(), () -> "The list should be not empty"),
		          () -> assertEquals(numberOfElements, listResult.size(), () -> "The list size should be " + numberOfElements),
		          () -> assertEquals(listExpected, listResult, () -> "The list should be " + listExpected));
		// @formatter:on
	}

}
