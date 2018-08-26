package com.hanthink.report.core.feature.orm.dialect;

import com.hanthink.report.core.feature.orm.dialect.Dialect;
import com.hanthink.report.core.feature.orm.dialect.MySqlPageHepler;

/**
 * MySQL数据库方言
 * 
 * @author StarZou
 * @since 2014年5月18日 下午1:32:52
 **/
public class MySqlDialect extends Dialect {

    protected static final String SQL_END_DELIMITER = ";";

    @Override
    public String getLimitString(String sql, int offset, int limit) {
        return MySqlPageHepler.getLimitString(sql, offset, limit);
    }

    @Override
    public String getCountString(String sql) {
        return MySqlPageHepler.getCountString(sql);
    }
}
