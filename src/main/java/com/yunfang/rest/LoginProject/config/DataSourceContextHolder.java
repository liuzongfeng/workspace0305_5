package com.yunfang.rest.LoginProject.config;

public class DataSourceContextHolder {
    /**
     * 默认数据源
     */
    public static final String DEFAULT_DS = "elebillsysDS";
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    // 设置数据源名
    public static void setDB(String dbType) {
        if(null == dbType || "".equals(dbType)){
            contextHolder.set(DEFAULT_DS);
        }else{
            contextHolder.set(dbType);
        }
    }
    // 获取数据源名
    public static String getDB() {
        return (contextHolder.get());
    }
    // 清除数据源名
    public static void clearDB() {
        contextHolder.remove();
    }
}
