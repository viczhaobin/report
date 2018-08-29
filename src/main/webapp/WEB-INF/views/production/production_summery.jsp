<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- 引入 ECharts 文件 -->
<script src="echart/echarts.js"></script>

<!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
<div id="main" style="width: 800px;height:450px;"></div>

<script type="text/javascript">
	
    // 基于准备好的dom，初始化echarts实例
    $("#main").width(document.documentElement.clientWidth);
	//$("#main").height(document.documentElement.clientHeight);
	
    var myChart = echarts.init($('#main')[0]);

    // 获取数据
    /* $.get("rest/getSelectProductionSummery", function(result){
	    console.log(result);
	}); */
	
	
	$(document).ready(function(){
		$.ajax({
	        type:'GET',
	        url:'rest/getSelectProductionSummery',
	        dataType: "json",
	        error:function(XMLHttpRequest, textStatus, errorThrown){
	            alert(textStatus);
	        },
	        success: function(optionJson){
	            if(window.console){
	                console.log(optionJson);
	             	// 使用刚指定的配置项和数据显示图表。
	                myChart.setOption(optionJson);
	            }
	        }
	    });
	});
	
	
    //窗口变化自动填充
	window.onresize = function() {
		$('#main').width('100%');
		myChart.resize();
	};
	
</script>