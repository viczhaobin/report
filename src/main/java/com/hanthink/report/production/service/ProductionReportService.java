package com.hanthink.report.production.service;

import java.util.ArrayList;
import java.util.HashMap;

public interface ProductionReportService {
	
	ArrayList<HashMap> selectProductionSummery(HashMap<String,Object> map);

}
