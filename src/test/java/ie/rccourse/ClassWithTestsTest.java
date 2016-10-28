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
	
	@Test
	public void countDays() {
		ClassWithTests cwt = new ClassWithTests();
		
		ArrayList<String>days = cwt.getDays();
		
		assertTrue(days.size() == 7);
		
				
	}
	
	
}
