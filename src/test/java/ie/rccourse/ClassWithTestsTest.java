package ie.rccourse;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ClassWithTestsTest {

	@Test
	public void countMonths() {
		ClassWithTests cwt = new ClassWithTests();
		
		ArrayList<String>months = cwt.getMonths();
		
		assertTrue(months.size() == 12);
	}
}
