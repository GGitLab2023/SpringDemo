package com.spring.dataBean;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

//import com.sun.xml.txw2.annotation.XmlElement;

public class Person {

	private String firstName, lastName, schoolName;
	private int rollNumber;
	private Date signUpDate;
	private String signUpDateAsString;
	private Date loadDate;
	private String loadDateAsString;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public Date getSignUpDate() {
		return signUpDate;
	}

	public void setSignUpDate(Date signUpDate) {
		this.signUpDate = signUpDate;
	}

	public Date getLoadDate() {
		return loadDate;
	}

	public void setLoadDate(Date loadDate) {
		this.loadDate = loadDate;
	}

	public String getSignUpDateAsString() {
		return signUpDateAsString;
	}

	public void setSignUpDateAsString(String signUpDateAsString) {
		this.signUpDateAsString = signUpDateAsString;
	}

	public String getLoadDateAsString() {
		return loadDateAsString;
	}

	public void setLoadDateAsString(String loadDateAsString) {
		this.loadDateAsString = loadDateAsString;
	}

	@Override
	public String toString() {
		return "PersonResult [FirstName=" + firstName + ", LastName=" + lastName + ", SchoolName=" + schoolName
				+ ", RollNumber=" + rollNumber + ", SignUpDate=" + signUpDateAsString + "]";
	}

	/*@Override
	public String toString() {
		return "PersonResult [FirstName=" + firstName + ", LastName=" + lastName + ", SchoolName=" + schoolName
				+ ", RollNumber=" + rollNumber + ", SignUpDate=" + signUpDate + "]";
	}*/
}
