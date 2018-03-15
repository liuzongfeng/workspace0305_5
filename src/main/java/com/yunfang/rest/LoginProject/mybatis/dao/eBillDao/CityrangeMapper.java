package com.yunfang.rest.LoginProject.mybatis.dao.eBillDao;

import com.yunfang.rest.LoginProject.mybatis.model.eBillModel.Cityrange;

import java.util.List;
import java.util.Map;

public interface CityrangeMapper {

    List<Cityrange> queryDataList(String cityname);

    List<Map> obtainDataSum();
    String searchCityName(String cityCode);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cityrange
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    int insert(Cityrange record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cityrange
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    int insertSelective(Cityrange record);
}