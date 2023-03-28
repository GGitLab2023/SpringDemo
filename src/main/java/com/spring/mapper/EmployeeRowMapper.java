package com.spring.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.dataBean.*;

public class EmployeeRowMapper implements RowMapper<Employee> {  
	   
	   @Override 
	   public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {  
	  
		   Employee emp = new Employee();
			
			emp.setEmpId(rs.getInt("EMPID"));
			emp.setEmpName(rs.getString("EMPNAME"));
			emp.setEmpSal(rs.getInt("EMPSAL"));
			emp.setEmpAddress(rs.getString("EMPADDRESS"));
			emp.setStatus(rs.getInt("status"));
			return emp;
			
	}
}