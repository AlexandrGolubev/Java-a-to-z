package ru.alexandr;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Alexandr Golubev (deed27@narod.ru)
* @version $Id$
* since 0.1
*/
public class CalculateTest {
	/**
	* Test add.
	*/
	@Test
    public void whenExecuteMainThenPrintToConsole() {
	    ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Calculate.main(null);
        assertThat(out.toString(), is("Hello world!\r\n"));
    }
}

