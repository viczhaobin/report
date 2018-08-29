package com.hanthink.report.test.echart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.github.abel533.echarts.AxisPointer;
import com.github.abel533.echarts.Grid;
import com.github.abel533.echarts.Legend;
import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.Timeline;
import com.github.abel533.echarts.Title;
import com.github.abel533.echarts.Tooltip;
import com.github.abel533.echarts.axis.AxisLabel;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.SplitLine;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.AxisType;
import com.github.abel533.echarts.code.PointerType;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.data.LineData;
import com.github.abel533.echarts.series.Bar;
import com.github.abel533.echarts.series.Series;
import com.github.abel533.echarts.util.EnhancedOption;
import com.hanthink.report.core.feature.test.TestSupport;
import com.hanthink.report.production.dao.ProductionReportMapper;


public class JsonUtilTest extends TestSupport {

	@Resource
	ProductionReportMapper productionReportMapper;
	
	@Test
	public void testJsonUtil () {
		Integer dataMap[][][] = new Integer[3][12][31];
		
		HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("cal_type", "daily");
        
        ArrayList<HashMap> rs;
        try {
        	rs = productionReportMapper.selectProductionSummery(map);
	        if (rs != null && rs.size()>0) {
	        	for(int i=0;i<rs.size();i++) {
	        		HashMap rsi = rs.get(i);
	        		String target = (String) rsi.get("target");
	        		
	        		String calTimeStr = (String) rsi.get("cal_time");
	        		int monthNum = Integer.parseInt(calTimeStr.substring(4, 6));
	        		int dayNum = Integer.parseInt(calTimeStr.substring(6, 8));
	        		int actualQty = ((Integer) rsi.get("actual_qty")).intValue();
	        		
		        	if("BS".equals(target))
		        	{
		        		dataMap[0][monthNum-1][dayNum-1] = actualQty;
		        	} else if ("PS".equals(target)) {
		        		dataMap[1][monthNum-1][dayNum-1] = actualQty;
		        	} else if ("PS".equals(target)) {
		        		dataMap[2][monthNum-1][dayNum-1] = actualQty;
		        	}
	        	}
	        }
        }
        catch(Exception e){
        	System.out.println("exception:"+e.getMessage());
        	
        }
        
		//设置echart属性
        EnhancedOption option = new EnhancedOption();
        
        Option baseOption = new Option();
		
		Timeline timeLine = new Timeline();
		timeLine.axisType(AxisType.category);
		timeLine.playInterval(1000);
		timeLine.data("2018-01-01","2018-02-01","2018-03-01","2018-04-01",
				"2018-05-01", "2018-06-01","2018-07-01","2018-08-01","2018-09-01",
				new LineData("2018-10-01", "diamond", 16),"2018-11-01","2018-12-01");
		baseOption.timeline(timeLine);
		
		Title title = new Title();
		title.subtext("产量统计");
		baseOption.title(title);
		
		baseOption.tooltip();

		Legend legend = new Legend();
		legend.x(X.right);
		legend.data("焊装车间","涂装车间","总装车间");
		legend.selected("涂装车间", false);
		legend.selected("总装车间", false);
		baseOption.legend(legend);
		
		baseOption.calculable(true);
		
		Grid grid = new Grid();
		grid.top(80);
		grid.bottom(100);
		Tooltip gToolTip = new Tooltip();
		gToolTip.trigger(Trigger.axis);
		AxisPointer axisPointer = new AxisPointer();
		axisPointer.type(PointerType.shadow);
		axisPointer.show(true);
		gToolTip.axisPointer(axisPointer);
		baseOption.grid(grid);
		baseOption.tooltip(gToolTip);
		
		CategoryAxis xAxis = new CategoryAxis();
		xAxis.axisLabel(new AxisLabel().interval(0));
		xAxis.data("1","\n2","3","\n4","5","\n6","7","\n8",
				"9","\n10","11","\n12","13","\n14","15","\n16",
				"17","\n18","19","\n20","21","\n22","23","\n24",
				"25","\n26","27","\n28","29","\n30","31");
		xAxis.splitLine(new SplitLine().show(false));
		
		ValueAxis yAxis = new ValueAxis();
		yAxis.name("产量(台)");
		baseOption.xAxis(xAxis);
		baseOption.yAxis(yAxis);
		
		baseOption.series(new Bar("焊装车间"),new Bar("涂装车间"),new Bar("总装车间"));
		
		List<Option> options = new ArrayList<>();
		for(int i=0;i<12;i++)
		{
			Option _option = new Option();
			_option.title("2018年" + i + "月产量统计");
			List<Series> _series = new ArrayList<>();
			Series<Bar> s1 = new Bar().data(dataMap[0][i]);
			Series<Bar> s2 = new Bar().data(dataMap[1][i]);
			Series<Bar> s3 = new Bar().data(dataMap[2][i]);
			_series.add(s1);
			_series.add(s2);
			_series.add(s3);
			
			_option.series(_series);
			
			options.add(_option);
		}
		option.baseOption(baseOption);
		
		option.options(options);
		
		option.view();
	}
}
