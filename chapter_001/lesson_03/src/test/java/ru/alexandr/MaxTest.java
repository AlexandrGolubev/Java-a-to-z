package ru.alexandr;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
	/**...
	* Max Test.
	* @author Alexander Golubev.
	* since 07.12.2016.
	*/
public class MaxTest {
	/**.
	* Test max.
	*/
	@Test
    public void whenSecondThenMax() {
		Max max = new Max();
		final int first = 1;
		final int second = 2;
		max.max(first, second);
		assertThat(2, is(second));
    }
	/**.
	* Test MaxThree.
	*/
	@Test
    public void whenFirstThenMax() {
		Max max = new Max();
		final int first = 3;
		final int second = 2;
		final int thrid = 1;
		max.max(first, second, thrid);
		assertThat(first, is(first));
    }
}