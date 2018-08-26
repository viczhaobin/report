package com.hanthink.report.core.generic;

import java.util.List;

/**
* GenericService的实现类, 其他的自定义 ServiceImpl, 继承自它,可以获得常用的增删查改操作,
 * 未实现的方法有 子类各自实现
* <p/>
* Model : 代表数据库中的表 映射的Java对象类型
* PK :代表对象的主键类型
* 
* @author 作者
* @version 创建时间：2018年8月26日 上午11:24:21
* 类说明
*/
public abstract class GenericServiceImpl<Model, PK> implements GenericService<Model, PK> {
	/**
	 * 定义成抽象方法,由子类实现,完成dao的注入
     *
     * @return GenericDao实现类
     */
    public abstract GenericDao<Model, PK> getDao();
    
    public int insert(Model model) {
        return getDao().insertSelective(model);
    }
    
    public int update(Model model) {
        return getDao().updateByPrimaryKeySelective(model);
    }
    
    public int delete(PK id) {
        return getDao().deleteByPrimaryKey(id);
    }
    
    public Model selectById(PK id) {
        return getDao().selectByPrimaryKey(id);
    }
    
    public Model selectOne() {
        return null;
    }

    public List<Model> selectList() {
        return null;
    }

}
