package com.with.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRun {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("ConfigWithDi/configWithDi.xml");
		SkillNetOffice s= (SkillNetOffice)con.getBean("emp");
	s.openOffice();
	}

}
