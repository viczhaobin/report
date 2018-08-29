package com.hanthink.report.test.production;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import com.hanthink.report.core.feature.test.TestSupport;
import com.hanthink.report.production.dao.ProductionReportMapper;

/**
* @author 作者
* @version 创建时间：2018年8月26日 下午4:15:37
* 类说明
*/
public class ProductionReportMapperTest extends TestSupport {
	
	@Resource
	private ProductionReportMapper productionReportMapper;

    @Test
    public void selectProductionSummery() {
        start();
        
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("cal_type", "daily");
        
        ArrayList<HashMap> rs;
        try {
        rs = productionReportMapper.selectProductionSummery(map);
	        if(rs != null && rs.size()>0) {
	        	System.out.println(rs.get(0));
	        	System.out.println(rs.get(0).getClass());
	        }
        }
        catch(Exception e){
        	System.out.println("exception:"+e.getMessage());
        	
        }
        
        System.out.println("nothing");
        
        end();
    }

}
