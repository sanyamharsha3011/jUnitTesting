package jUnitTestExamplePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddnumbers {

	@Test
	public void test() {
		jUnitTesting junit = new jUnitTesting();
		int result = junit.addnumbers(100, 300);
		assertEquals (400, result);
	}

}
