package com.spring.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class HelloWorldTasklet implements Tasklet
{
	String message;
	
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception 
	{
		System.out.println("===================================================");
		System.out.println("Hello This is a sample example of spring batch"); 
		System.out.println("Message is: "+message+ "\n");
		System.out.println("===================================================");
		return RepeatStatus.FINISHED;
	}

}
