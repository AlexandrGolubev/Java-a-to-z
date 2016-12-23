package ru.alexandr;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
	/**...
	* Turn Test.
	* @author Alexander Golubev.
	* since 07.12.2016.
	*/
public class BubbleSorterTest {
	/**.
	* BubbleSorter test.
	*/
	@Test
	public void whenSortThenValue() {
		final int one = 1;
		final int two = 2;
		final int three = 3;
		BubbleSorter bs = new BubbleSorter();
		int[] value = {one, three, two };
		int[] expect = {one, two, three};
		assertThat(bs.sort(value), is(expect));
	}
}

