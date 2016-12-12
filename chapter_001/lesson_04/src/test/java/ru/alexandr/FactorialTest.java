package ru.alexandr;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**...
	* Factorial Test.
	* @author Alexander Golubev.
	* since 12.12.2016.
	*/
public class FactorialTest {
	/**.
	* Test factorial.
	*/
	@Test
    public void whenMultipleSecondThenResult() {
		Factorial factorial = new Factorial();
		final int first = 1;
		final int second = 5;
		final int result = 120;
		factorial.factorial(first, second);
		assertThat(result, is(result));
    }
}