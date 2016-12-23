package ru.alexandr;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
	/**...
	* Quadrate Test.
	* @author Alexander Golubev.
	* since 22.12.2016.
	*/
public class QuadrateTest {
	/**.
	* Test quadrate.
	*/
	@Test
    public void whenAddSStartToFinishThenResult() {
		Quadrate quadrate = new Quadrate();
		int[][] actual = new int[][]{
		  {1, 2},
		  {1, 2},
		};
		int[][] expected = new int[][]{
		  {1, 1},
		  {2, 2},
		};
		assertThat(quadrate.turn(actual), is(expected));
    }
}