package com.with.di;

public class EmpEntryPunchCard implements EmpEntryInterface {

	public EmpEntryPunchCard() {
		System.out.println("EmpEntryPunchCard() default constractor");
	}

	public void entryActivated() {
		System.out.println("EmpEntryPunchCard time activated");
	}
	public void entryDeActivated() {
		System.out.println("EmpEntryPunchCard time deactivated");
	}
	
}
