package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IndexOps {

	@Test
	public void checkCharAt() {
		StringBuilder sb = new StringBuilder("123");
		assertTrue(sb.charAt(0) == '1');
		assertTrue(sb.charAt(1) == '2');
		assertTrue(sb.charAt(2) == '3');
	}

	@Test
	public void checkIndexOfString() {
		StringBuilder sb = new StringBuilder("123");
		assertTrue(sb.indexOf("1") == 0);
		assertTrue(sb.indexOf("2") == 1);
		assertTrue(sb.indexOf("3") == 2);
		assertTrue(sb.indexOf("4") == -1);
	}

	@Test
	public void checkIndexOfStringFromIndex() {
		StringBuilder sb = new StringBuilder("123");
		assertTrue(sb.indexOf("1", 1) == -1);
		assertTrue(sb.indexOf("2", 1) == 1);
		assertTrue(sb.indexOf("3", 1) == 2);
		assertTrue(sb.indexOf("4", 1) == -1);
	}
}
