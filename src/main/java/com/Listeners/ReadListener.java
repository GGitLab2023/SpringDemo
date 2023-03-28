package com.Listeners;

import org.springframework.batch.core.ItemReadListener;

public class ReadListener implements ItemReadListener {

	@Override
	public void beforeRead() {
		System.out.println("Before Reading");
	}

	@Override
	public void afterRead(Object item) {
		System.out.println("After reading" + item.toString());
	}

	@Override
	public void onReadError(Exception ex) {
		System.out.println("Error occured while Reading");
	}

}
