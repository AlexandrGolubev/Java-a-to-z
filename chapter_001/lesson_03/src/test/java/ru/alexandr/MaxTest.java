package ru.alexandr;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
	/**...
	* Calculate Test.
	* @author Alexander Golubev.
	* since 30.11.2016.
	*/
public class MaxTest {
	/**.
	* Test add.
	*/
	@Test
    public void whenSecondThenMax() {
		Max max = new Max();
		final int first = 1;
		final int second = 2;
		final int max = 2;
		max.max(first, second);
		assertThat(result, is(2));
    }
}