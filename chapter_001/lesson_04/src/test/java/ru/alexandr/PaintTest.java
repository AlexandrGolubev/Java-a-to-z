package ru.alexandr;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
	/**...
	* Piramid Test.
	* @author Alexander Golubev.
	* since 15.12.2016.
	*/
public class PaintTest {
	/**
	* Number 1.
	*/
	private final int one = 1;
	/**
	* Number 2.
	*/
	private final int two = 2;
	/**.
	* Piramid test hight 1.
	*/
	@Test
	public void whenBuildingThenPyramidOne() {
	String expected = " ^";
	Paint paint = new Paint();
	int h = 2;
	assertThat(paint.piramid(one), is(expected));
	}
	/**.
	* Piramid test hight 2.
	*/
	@Test
	public void whenBuildingThenPyramidTwo() {
	String expected = " ^ " + "^ ^";
	Paint paint = new Paint();
	int h = 2;
	assertThat(paint.piramid(two), is(expected));
	}
}