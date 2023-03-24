package com.spring.main.app.run;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeJobRun {  
	   
	   public static void main(String[] args) throws Exception { 
	     
	      ApplicationContext context = new ClassPathXmlApplicationContext("config/JobConfig.xml");  
	      
	     
	      JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher"); 
	    
	      Job job = (Job) context.getBean("employeeJob"); 
	    
	      JobExecution execution = jobLauncher.run(job, new JobParameters()); 
	      System.out.println("Exit Status : " + execution.getStatus()); 
	   } 
	}
