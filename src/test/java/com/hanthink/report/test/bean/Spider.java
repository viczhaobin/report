package com.hanthink.report.test.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Spider : 爬虫类, 此类只为说明Spring 一些使用方法
 * 
 * @author 作者
 * @version 创建时间：2018年8月26日 下午4:32:10
 * 类说明
*/
public class Spider implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, BeanPostProcessor {

	private String beanName;

    private BeanFactory beanFactory;

    private ApplicationContext applicationContext;
	
    /**
     * 爬虫方法
     *
     * @param URI
     * @return data
     */
    public String capture(String URI) {
        String data = "";
        return data;
    }
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Spider.postProcessBeforeInitialization");
        return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Spider.postProcessAfterInitialization");
        return bean;
	}

	/**
     * 初始化操作
     *
     * @throws Exception
     */
	public void afterPropertiesSet() throws Exception {
		System.out.println("Spider.afterPropertiesSet");
	}

	/**
     * 注入 applicationContext
     *
     * @param applicationContext
     * @throws BeansException
     */
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
        System.out.println("Spider.setApplicationContext");		
	}

	/**
     * 注入 beanFactory
     *
     * @param beanFactory
     * @throws BeansException
     */
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
        System.out.println("Spider.setBeanFactory");
	}

	/**
     * 注入 对象name
     *
     * @param name
     */
	public void setBeanName(String name) {
		this.beanName = name;
        System.out.println("Spider.setBeanName");
	}

}
