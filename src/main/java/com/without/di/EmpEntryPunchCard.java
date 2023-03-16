package com.without.di;

public class EmpEntryPunchCard {

	public EmpEntryPunchCard() {
		System.out.println("EmpEntryPunchCard() default constractor");
	}

	void entryActivated() {
		System.out.println("EmpEntryPunchCard time activated");
	}
	void entryDeActivated() {
		System.out.println("EmpEntryPunchCard time deactivated");
	}
	
}
