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
	@Test
	public void test99() {
		String expected = "ninety nine";
		String actual = eng.translateEng(99);
		assertThat(actual, is(expected));
	}
	@Test
	public void test100() {
		String expected = "one hundred";
		String actual = eng.translateEng(100);
		assertThat(actual, is(expected));
	}
	@Test
	public void testminas1() {
		String expected = "正の整数で。";
		String actual = eng.translateEng(-1);
		assertThat(actual, is(expected));
	}
	@Test
	public void test420() {
		String expected = "four hundred twenty";
		String actual = eng.translateEng(420);
		assertThat(actual, is(expected));
	}
	@Test
	public void test111() {
		String expected = "one hundred eleven";
		String actual = eng.translateEng(111);
		assertThat(actual, is(expected));
	}
	@Test
	public void test0() {
		String expected = "zero";
		String actual = eng.translateEng(0);
		assertThat(actual, is(expected));
	}
	
}
