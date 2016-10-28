package ie.rccourse;

import java.util.ArrayList;

public class ClassWithTests {
	
	ArrayList<String> months;
	
	
	public ArrayList<String> getMonths() {
		return months;
	}

	public void setMonths(ArrayList<String> months) {
		this.months = months;
	}

	public ClassWithTests() {
		months.add("January");
		months.add("February");
		months.add("March");
	}

}
