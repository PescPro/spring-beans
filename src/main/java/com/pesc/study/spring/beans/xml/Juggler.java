package com.pesc.study.spring.beans.xml;

import com.pesc.study.spring.beans.xml.exceptions.PerformanceException;

public class Juggler implements Performer {

	private int beanBags = 3;

	public Juggler(){

	}

	public Juggler(int beanBags){
		this.beanBags = beanBags;
	}

	/**
	 * 表演方法
	 */
	public void perform() throws PerformanceException {
		System.out.println("JUGGLING " + beanBags + " BEANBAGS");
	}
}
