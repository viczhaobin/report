package com.hanthink.report.core.feature.test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Spring测试支持,用于测试由Spring 管理的bean,编写测试类时,继承该类
 * 
* @author 作者
* @version 创建时间：2018年8月26日 下午12:29:35
* 类说明
*/
@ContextConfiguration(locations = {"classpath*:spring/applicationContext.xml"})
public class TestSupport extends AbstractJUnit4SpringContextTests {
	protected long startTime;
    protected long endTime;
    
    protected long start() {
        this.startTime = System.currentTimeMillis();
        return startTime;
    }
    
    protected long end() {
        this.endTime = System.currentTimeMillis();
        this.log();
        return endTime;
    }
    
    protected void log() {
        String text = "\n开始时间 : " + this.startTime + "\n结束时间 : " + this.endTime + "\n执行时间 : " + (this.endTime - this.startTime);
        logger.info(text);
    }
}
