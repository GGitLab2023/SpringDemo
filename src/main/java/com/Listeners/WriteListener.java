package com.Listeners;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.batch.core.ItemWriteListener;
import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.dataBean.Employee;

public class WriteListener implements ItemWriteListener {
	 //private String Insert_Query="insert into Employee_Stats(EmpId,EmpName,EmpSal,EmpAddress) values(?,?,?,?)";
	
	String UPDATE_QUERY = "update employee set status=1";
	
	//String UPDATE_QUERY1 = "update employee set empName='Raj' where empId=2";
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		System.out.println("setdatasource called");
		this.dataSource = dataSource;
	}

	public void beforeWrite(List items) {
		System.out.println("In next step to write following items:" + items.toString());
	}

	public void afterWrite(List items) {
		int result = 0;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		for (Object user : items) {
			Object[] params = { ((Employee) user).getEmpId(), ((Employee) user).getEmpName(),
					((Employee) user).getEmpAddress(), ((Employee) user).getEmpSal(), ((Employee) user).getStatus() };
			//result= jdbcTemplate.update(Insert_Query,params);
			result = jdbcTemplate.update(UPDATE_QUERY);
			//result = jdbcTemplate.update(UPDATE_QUERY1);
			
		}

		System.out.println("result" + result);
	}

	@Override
	public void onWriteError(Exception exception, List items) {
		System.out.println(exception.toString());
	}

}