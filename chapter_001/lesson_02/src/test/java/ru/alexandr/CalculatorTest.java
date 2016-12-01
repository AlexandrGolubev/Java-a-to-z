package ru.alexandr;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**...
 * Calculate Test.
 * @author Alexander Golubev.
 * since 30.11.2016.
 */

 public class CalculatorTest {
	/**.
	* Test add.
	*/
	@Test
    public void whenAddTwoAndTwoThenFour() {
		final Calculator calc = new Calculator();
		final double answer = 4d;
		final double first = 2d;
		final double second = 2d;
		calc.add(first, second);
		final double result = calc.getResult();
        assertThat(result, is(answer));
    }
	/**...
	* Test substract.
	*/
	@Test
    public void whenSubstractTwoAndOneThenOne() {
        final Calculator calc = new Calculator();
		final double answer = 1d;
		final double first = 2d;
		final double second = 1d;
		calc.substract(first, second);
		final double result = calc.getResult();
        assertThat(result, is(answer));
    }
	/**...
	* Test multiple.
	*/
	@Test
    public void whenMultipleThreeAndTwoThenSix() {
		final Calculator calc = new Calculator();
		final double answer = 6d;
		final double first = 3d;
		final double second = 2d;
		calc.multiple(first, second);
		final double result = calc.getResult();
        assertThat(result, is(answer));
    }
	/**...
	* Test divide.
	*/
	@Test
    public void whenDivisionSixAndThreeThenTwo() {
		final Calculator calc = new Calculator();
		final double answer = 2d;
		final double first = 6d;
		final double second = 3d;
		calc.div(first, second);
		final double result = calc.getResult();
        assertThat(result, is(answer));
	}
}