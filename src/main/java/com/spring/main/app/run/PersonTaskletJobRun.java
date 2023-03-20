package com.spring.main.app.run;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*This class will get the bean from the context file (i.e. personTaskletJob.xml) and calls the jobLauncherObj.run() method to execute the job.*/
public class PersonTaskletJobRun {

	static ApplicationContext contextObj;

	public static void main(String[] args) throws IOException {
		
		//it's used for logger to show information on console
		String jobFileName = null;
		String jobIdName = null;
		/*Load a properties file config.properties from project classpath, and retrieved the property value.*/
		try (InputStream input = PersonTaskletJobRun.class.getClassLoader()
				.getResourceAsStream("\\propertyFiles\\config.properties")) {
			Properties prop = new Properties();

			if (input == null) {
				System.out.println("Sorry, unable to find config.properties");
				return;
			}

			// load a properties file from class path, inside static method
			prop.load(input);
			jobFileName = prop.getProperty("person.tasklet.job.file.name");
			jobIdName = prop.getProperty("person.tasklet.job.id.name");
			System.out.println("Job File Name is: " + jobFileName+ " and job id is: "+jobIdName+ "\n");

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		// Loading The Bean Definition From The Spring Configuration File
		contextObj = new ClassPathXmlApplicationContext(jobFileName);
		 JobLauncher jobLauncherObj = (JobLauncher) contextObj.getBean("jobLauncher");
		 Job jobObj = (Job) contextObj.getBean(jobIdName);
		
		JobParametersBuilder builder = new JobParametersBuilder();
		builder.addDate("date", new Date());
		
		try {			
            JobExecution execution = jobLauncherObj.run(jobObj, builder.toJobParameters());
			
			System.out.println("\nExit Status : " + execution.getStatus());

		} catch (Exception eObj) {
			eObj.printStackTrace();
		}

		System.out.println("Done");

	}
}