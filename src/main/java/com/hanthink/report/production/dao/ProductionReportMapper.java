package com.hanthink.report.production.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface ProductionReportMapper {

	ArrayList<HashMap> selectProductionSummery(HashMap<String,Object> map);
	
}
