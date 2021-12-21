package com.karson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * <p>Company: https://www.onessc.com/</p>
 *
 * @author Karson.Wang
 * @date 2021/12/15 14:12
 */
public class Test {

	public static void main(String[] args) {
//		ApplicationContext ac = new MyClassPathXmlApplicationContext("spring-${username}.xml");

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-${username}.xml");
//		Person bean = ac.getBean(Person.class);
//		System.out.println(bean);
	}
}
