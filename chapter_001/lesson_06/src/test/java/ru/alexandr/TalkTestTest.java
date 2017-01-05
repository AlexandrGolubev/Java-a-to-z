package ru.alexandr;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

	/**
	* DeleteDuble Test.
	* @author Alexander Golubev.
	* since 30.12.2016.
	*/
public class TalkTestTest {
    /**
     * Test TalkTest.
     */
    @Test
    public void containsTest() {
        TalkTest test = new TalkTest();
		final String origin = "Hello";
		final String sub = "el";
        assertThat(test.contains("Hello", "el"), is(true));
    }
}