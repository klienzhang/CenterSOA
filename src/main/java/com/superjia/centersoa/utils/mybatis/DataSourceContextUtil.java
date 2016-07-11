package com.superjia.centersoa.utils.mybatis;

/**
 * Created by Administrator on 2016/4/5.
 */
public class DataSourceContextUtil {

    private static ThreadLocal<String> currentDataSource = new ThreadLocal<String>();
    private final static String defaultDataSource = "uat";
    private static String CurrentDataSource = defaultDataSource;

    public static void setTargetDataSource(String TargetDataSource){
        if(null == TargetDataSource){
            //do nothing
        }else{
            TargetDataSource = TargetDataSource.trim().toLowerCase();
            if(TargetDataSource.contains("sit")){
                currentDataSource.set("sit");
            }else {
                currentDataSource.set("uat");
            }
        }
    }

    public static String getCurrentDataSource(){
        String ds = currentDataSource.get();
        return (ds == null) ? defaultDataSource : ds;
    }
}
