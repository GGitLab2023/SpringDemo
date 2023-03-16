package com.simple.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonAppRun {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("simplespring/simpleTaskletJob.xml");
		Person p=(Person)context.getBean("Person");
		System.out.println("this is person id"+p.getPid());
		System.out.println("this is person name"+p.getPname());
		System.out.println("this is person age"+p.getPage());

	}

}
