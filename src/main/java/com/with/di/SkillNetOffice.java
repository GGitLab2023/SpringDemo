package com.with.di;

public class SkillNetOffice {

	/*
	 * EmpEntryPunchCard empEntry=new EmpEntryPunchCard();
	 */
	private EmpEntryInterface empEntry;

	public void openOffice() {

		empEntry.entryActivate();

		System.out.println("Open Office");
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
