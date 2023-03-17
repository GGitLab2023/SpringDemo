package com.without.di;

public class SkillNetOffice {
	 EmpEntryPunchCard empEntry=new EmpEntryPunchCard();
	 
	public void openOffice() {
		
		empEntry.entryActivate();
		
		System.out.println("Open Office");
	}

	public void closeOffice() {

	}
}
