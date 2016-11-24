package ru.alexandr;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculateTest {

       @Test
       public void whenAddOneToOneThenTwo() {
	 	ByteArrayOutputStream out = new ByteArrayOutputStream();
        	System.setOut(new PrintStream(out));
        	Calculate.main(null);
        	assertThat(out.toString(), is("Hello world!\r\n"));
    }
}
