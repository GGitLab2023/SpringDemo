package com.with.di;

public class EmpEntryPunchCard implements EmpEntryInterface{
	public EmpEntryPunchCard() {
		System.out.println("EmpEntryPunchCard default");
	}

	public void entryActivate() {
		System.out.println("EmpEntryPunchCard Time Activated");
	}

	public void entryDeActivate() {
		System.out.println("EmpEntryPunchCard Time DeActivated");
	}
	

}
