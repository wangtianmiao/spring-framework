package com.karson.selfAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.EmbeddedValueResolver;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;

import java.security.AccessControlContext;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * <p>Company: https://www.onessc.com/</p>
 *
 * @author Karson.Wang
 * @date 2021/12/30 9:22
 */
public class MyAwareProcessor implements BeanPostProcessor {

	private final ConfigurableApplicationContext applicationContext;

	public MyAwareProcessor(ConfigurableApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		AccessControlContext acc = null;
		if (System.getSecurityManager() != null) {
			acc = this.applicationContext.getBeanFactory().getAccessControlContext();
		}

		((ApplicationContextAware) bean).setApplicationContext(this.applicationContext);

		return bean;
	}
}
