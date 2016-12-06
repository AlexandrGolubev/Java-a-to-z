package ru.alexandr;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
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
    public void whenAreaThenRithArea() {
		Point a = new Point(1, 2);
		Point b = new Point(2, 2);
		Point c = new Point(2, 1);
		Triangle triangle = new Triangle(a, b, c);
		double result = triangle.area();
		assertThat(result, closeTo(0, 0.5));
    }
 }