package ru.alexandr;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**.
 * Triangle Test.
 * @author Alexander Golubev.
 * since 05.12.2016.
 */
 public class TriangleTest {
	/**.
	* Triangle test.
	*/
	@Test
    public void trianglTest() {
		final int x1 = 1;
		final int y1 = 2;
		final int x2 = 2;
		final int y2 = 2;
		final int x3 = 2;
		final int y3 = 1;
		final double result = 0.49;
		Triangle triangle = new Triangle(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
		assertThat(result, is(result));
    }
}