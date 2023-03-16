package com.sampl.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonApp {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("simplespring/config.xml");
	Person p=	(Person) con.getBean("person");
	System.out.println( "Age="+p.getAge());
	System.out.println( "Name="+p.getName());
	System.out.println( "Id="+p.getId());
	}

}
