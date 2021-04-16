package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		jUnitFunction junit = new jUnitFunction();
		int result = junit.addNumber(20, 40);
		assertEquals(60, result);
	}

}
