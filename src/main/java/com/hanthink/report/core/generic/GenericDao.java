package com.hanthink.report.core.generic;
/**
 *  所有自定义Dao的顶级接口, 封装常用的增删查改操作,
 * 可以通过Mybatis Generator Maven 插件自动生成Dao,
 * 也可以手动编码,然后继承GenericDao 即可.
* <p/>
* Model : 代表数据库中的表 映射的Java对象类型
* PK :代表对象的主键类型
* 
* @author 作者
* @version 创建时间：2018年8月26日 上午11:32:04
* 类说明
*/
public interface GenericDao<Model, PK> {

	int insertSelective(Model model);
	
	int updateByPrimaryKeySelective(Model model);
	
	int deleteByPrimaryKey(PK id);
	
	Model selectByPrimaryKey(PK id);
}
