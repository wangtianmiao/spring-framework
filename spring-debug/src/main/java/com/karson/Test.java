package com.karson;

import com.karson.selfeditor.Customer;
import com.karson.selftag.User;
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

//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		User user = (User) ac.getBean("karson");
//		System.out.println(user.getUserName());
//		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-${username}.xml");
//		Person bean = ac.getBean(Person.class);
//		System.out.println(bean);


		ApplicationContext ac = new ClassPathXmlApplicationContext("selfEditor.xml");
		Customer bean = ac.getBean(Customer.class);
		System.out.println(bean);
	}
}