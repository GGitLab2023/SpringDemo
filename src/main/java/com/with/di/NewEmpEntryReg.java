package com.with.di;

public class NewEmpEntryReg implements EmpEntryInterface {
	public NewEmpEntryReg() {
		System.out.println("NewEmpEntryReg() default constractor");
	}

	public void entryActivated() {
		System.out.println("NewEmpEntryRegdtime activated");
	}
	public void entryDeActivated() {
		System.out.println("NewEmpEntryReg time deactivated");
	}
	
}

