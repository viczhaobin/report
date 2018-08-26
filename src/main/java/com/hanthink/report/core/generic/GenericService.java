package com.hanthink.report.core.generic;

import java.util.List;

/**
 * 所有自定义Service的顶级接口,封装常用的增删查改操作
* <p/>
* Model : 代表数据库中的表 映射的Java对象类型
* PK :代表对象的主键类型
* 
* @author 作者
* @version 创建时间：2018年8月26日 上午11:18:44
* 类说明
*/
public interface GenericService<Model, PK> {
	
	int insert(Model model);
	
	int update(Model model);
	
	int delete(PK id);

	Model selectById(PK id);
	
	Model selectOne();
	
	List<Model> selectList();
}
