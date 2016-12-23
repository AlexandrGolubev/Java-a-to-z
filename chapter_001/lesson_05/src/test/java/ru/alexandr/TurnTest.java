package ru.alexandr;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

	/**...
	* Turn Test.
	* @author Alexander Golubev.
	* since 07.12.2016.
	*/
public class TurnTest {
	/**.
	* Test turn.
	*/
	@Test
	public void whenArrayBackThenTurnArray() {
		Turn turn = new Turn();
		final int[] srcArray = {1, 2, 3};
		final int[] expect = {3, 2, 1};
		int[] resultArray = turn.back(srcArray);
		assertThat(resultArray, is(expect));
	}
}