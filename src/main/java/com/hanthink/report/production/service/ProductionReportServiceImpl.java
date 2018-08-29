package com.hanthink.report.production.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hanthink.report.production.dao.ProductionReportMapper;

@Service
public class ProductionReportServiceImpl implements ProductionReportService {

	@Resource
    private ProductionReportMapper productionReportMapper;
	
	@Override
	public ArrayList<HashMap> selectProductionSummery(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return productionReportMapper.selectProductionSummery(map);
	}
}
