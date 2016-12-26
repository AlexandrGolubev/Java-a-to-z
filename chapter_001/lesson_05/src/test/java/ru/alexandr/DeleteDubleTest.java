package ru.alexandr;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
	/**...
	* DeleteDuble Test.
	* @author Alexander Golubev.
	* since 26.12.2016.
	*/
public class DeleteDubleTest {
	/**.
	* Test DeleteDuble.
	*/
	@Test
	public void whenDubleThenDelete() {
		DeleteDuble duble = new DeleteDuble();
		final String[] words = {"Hi", "Petr", "Hi", "Petr"};
		final String[] expect = {"Hi", "Petr"};
		assertThat(duble.delete(words), is(expect));
	}
}