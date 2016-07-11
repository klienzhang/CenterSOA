package com.superjia.centersoa.utils.mybatis;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by Administrator on 2016/4/5.
 */
public class DynamicDataSource extends AbstractRoutingDataSource{

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextUtil.getCurrentDataSource();
    }
}
