package assign5;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class test {
	IntToEng eng = new IntToEng();

	@Test
	public void test1() {
		String expected = "one";
		String actual = eng.translateEng(1);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void test21() {
		String expected = "twenty one";
		String actual = eng.translateEng(21);
		assertThat(actual, is(expected));
	}

}
