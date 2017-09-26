package jUnitTestExamplePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitTesting junit = new jUnitTesting();
		String result = junit.addstring("Sanyam ", "Harsha");
		assertEquals ("Sanyam Harsha" , result);
	}

}
