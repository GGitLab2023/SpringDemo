package com.spring.mapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.joda.time.LocalDate;
import org.springframework.jdbc.core.RowMapper;
import com.spring.dataBean.Person;

/*this class simply maps the attribute in the Person.java class with the fields read from database table "PERSON_DETAILS"*/
public class PersonMapper implements RowMapper<Person>{

	SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person = new Person();
		
		person.setFirstName(rs.getString("FIRST_NAME"));
		person.setLastName(rs.getString("LAST_NAME"));
		person.setSchoolName(rs.getString("SCHOOL_NAME"));
		person.setRollNumber(rs.getInt("ROLL_NUMBER"));
		
		Date dd = rs.getDate("SIGNUP_DATE");
		//person.setSignUpDate(dd);//this will set in result as yyyy-MM-dd(but in db,it is in dd-MM-yyyy format)
		
		//dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		//dateFormat = new SimpleDateFormat("dd MMMM yyyy");
		//dateFormat = new SimpleDateFormat("dd MMMM yyyy zzzz");
		//dateFormat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		dateFormat = new SimpleDateFormat("EEEE, dd-MMM-yyyy HH:mm:ss z");
		
		String strDate = dateFormat.format(dd);
		person.setSignUpDateAsString(strDate);
		
		return person;
	}
	
}