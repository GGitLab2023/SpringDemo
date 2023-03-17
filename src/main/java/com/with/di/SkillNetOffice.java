package com.with.di;

public class SkillNetOffice {
	// EmpEntryPunchCard empEntry= new EmpEntryPunchCard();
	// NewEmpEntryReg empEntry=new NewEmpEntryReg();
	private EmpEntryInterface empEntry;

	public void openOffice() {
		empEntry.entryActivated();
	}

	public void closeOffice() {

	}

	public EmpEntryInterface getEmpEntry() {
		return empEntry;
	}

	public void setEmpEntry(EmpEntryInterface empEntry) {
		this.empEntry = empEntry;
	}
}
