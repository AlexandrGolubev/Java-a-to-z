package ru.alexandr;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**.
 * Point Test.
 * @author Alexander Golubev.
 * since 05.12.2016.
 */

 public class PointTest {
	/**.
	* Test point.
	*/
	@Test
    public void whenAddFirstAndSecondThenResult() {
		Point first = new Point(1.0, 1.0);
		Point second = new Point(2.0, 1.0);
		double result = first.distanceTo(second);
		assertThat(result, closeTo(1.0, 0.0));
    }
}