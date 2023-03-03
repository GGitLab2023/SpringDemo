package com.spring.main.app.run;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*This class will get the bean from the context file (i.e. simpleTaskletJob.xml) and calls the jobLauncherObj.run() method to execute the job.*/
public class SimpleTaskletJobRun {

	@SuppressWarnings("resource")
    public static void main(String areg[]) throws IOException
	{         
        ApplicationContext context = new ClassPathXmlApplicationContext("batch/Jobs/simpleTaskletJob.xml");
        
        // Creating the job launcher
        JobLauncher jobLauncherObj = (JobLauncher) context.getBean("jobLauncher");
        // Creating the job
        Job job = (Job) context.getBean("simpleTaskletJob");
        
        // Executing the JOB 
        try {
            JobExecution execution = jobLauncherObj.run(job, new JobParameters());
            System.out.println("Job Exit Status : "+ execution.getStatus());
 
        } catch (JobExecutionException e) {
            System.out.println("Job failed");
            e.printStackTrace();
        }
    }
}