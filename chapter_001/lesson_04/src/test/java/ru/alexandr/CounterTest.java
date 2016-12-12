package ru.alexandr;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**...
	* Counter Test.
	* @author Alexander Golubev.
	* since 07.12.2016.
	*/
public class CounterTest {
	/**.
	* Test counter.
	*/
	@Test
    public void whenAddSStartToFinishThenResult() {
		Counter counter = new Counter();
		final int start = 0;
		final int finish = 10;
		final int result = 20;
		counter.add(start, finish);
		assertThat(result, is(result));
    }
}