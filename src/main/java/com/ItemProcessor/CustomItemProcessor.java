package com.ItemProcessor;

import org.springframework.batch.item.ItemProcessor;

import com.spring.dataBean.*;

public class CustomItemProcessor implements ItemProcessor<Employee, Employee> {

	@Override
	public Employee process(Employee item) throws Exception {
		System.out.println("Processing..." + item);
		return item;
	}
}
