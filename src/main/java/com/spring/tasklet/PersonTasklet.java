package com.spring.tasklet;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.databean.Person;
import com.spring.mapper.PersonMapper;

/*this tasklet class is executed from our job(person-job.xml). it just reads from database table and prints out the statement*/
public class PersonTasklet implements Tasklet {

	private DataSource dataSource;
    private String sql="SELECT FIRST_NAME, LAST_NAME, SCHOOL_NAME, ROLL_NUMBER, SIGNUP_DATE FROM PERSON_DETAILS";
    
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		
		List<Person> personList = new ArrayList<Person>();
		JdbcTemplate myTemplate = new JdbcTemplate(getDataSource());
        personList = myTemplate.query(sql, new PersonMapper());
        
        for(Person p: personList){
            System.out.println(p.toString());
        }
        return RepeatStatus.FINISHED;
	}

	public DataSource getDataSource() {
        return dataSource;
    }
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public void init() throws Exception
    {
        System.out.println("\nBean Person has been "
            + "instantiated and I'm the init() method\n");
    }
 
    // This method executes when the spring container is closed
    public void destroy() throws Exception
    {
        System.out.println(
            "Container has been closed "
            + "and I'm the destroy() method");
    }
	
}
