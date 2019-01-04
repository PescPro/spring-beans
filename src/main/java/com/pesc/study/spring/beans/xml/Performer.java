package com.pesc.study.spring.beans.xml;

import com.pesc.study.spring.beans.xml.exceptions.PerformanceException;

/**
 * 表演者
 */
public interface Performer {
	/**
	 * 表演方法
	 */
	void perform() throws PerformanceException;
}
