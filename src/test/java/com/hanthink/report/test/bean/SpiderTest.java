package com.hanthink.report.test.bean;

import javax.annotation.Resource;

import org.junit.Test;

import com.hanthink.report.core.feature.test.TestSupport;

/**
* @author 作者
* @version 创建时间：2018年8月26日 下午4:39:24
* 类说明
*/
public class SpiderTest extends TestSupport {
	@Resource
    private Spider spider;

    @Test
    public void testInjectSpider() throws Exception {
        System.out.println(spider);
    }
}
