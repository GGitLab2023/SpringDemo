package com.without.di;

public class SkillNetOffice {
	//EmpEntryPunchCard empEntry= new EmpEntryPunchCard();
	NewEmpEntryReg empEntry=new NewEmpEntryReg();
	
	public void openOffice() 
	{
		empEntry.entryActivated();
		System.out.println("This is skillnet office openOffice()");
	}
	public void closeOffice()
	{
		
	}
}

