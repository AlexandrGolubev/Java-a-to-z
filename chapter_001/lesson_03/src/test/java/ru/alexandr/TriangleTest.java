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
		final double x1 = 1;
		final double y1 = 2;
		final double x2 = 2;
		final double y2 = 2;
		final double x3 = 2;
		final double y3 = 1;
		final double result = 0.49999999999999983;
		Triangle triangle = new Triangle(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
		assertThat(triangle.area(), is(result));
    }
}