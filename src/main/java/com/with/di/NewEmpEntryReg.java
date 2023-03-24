package com.with.di;

public class NewEmpEntryReg implements EmpEntryInterface{
	
	public NewEmpEntryReg() {
		System.out.println("NewEmpEntryReg default");
	}

	public void entryActivate() {
		System.out.println("NewEmpEntryReg Time Activated");
	}

	public void entryDeActivate() {
		System.out.println("NewEmpEntryReg Time DeActivated");
	}
}
