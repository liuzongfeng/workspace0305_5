package com.yunfang.rest.LoginProject.mybatis.model.eBillModel;

public class Cityrange {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cityrange.ID
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cityrange.PID
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cityrange.CityName
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    private String cityname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cityrange.CityEasyName
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    private String cityeasyname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cityrange.Level
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    private Integer level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cityrange.CityCode
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    private String citycode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cityrange.Pinyin
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    private String pinyin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cityrange.Status
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cityrange.Sort
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    private Integer sort;


    private AnliData anliData;
    private BasicData basicData;

    public AnliData getAnliData() {
        return anliData;
    }

    public void setAnliData(AnliData anliData) {
        this.anliData = anliData;
    }

    public BasicData getBasicData() {
        return basicData;
    }

    public void setBasicData(BasicData basicData) {
        this.basicData = basicData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cityrange.ID
     *
     * @return the value of cityrange.ID
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cityrange.ID
     *
     * @param id the value for cityrange.ID
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cityrange.PID
     *
     * @return the value of cityrange.PID
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cityrange.PID
     *
     * @param pid the value for cityrange.PID
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cityrange.CityName
     *
     * @return the value of cityrange.CityName
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cityrange.CityName
     *
     * @param cityname the value for cityrange.CityName
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cityrange.CityEasyName
     *
     * @return the value of cityrange.CityEasyName
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public String getCityeasyname() {
        return cityeasyname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cityrange.CityEasyName
     *
     * @param cityeasyname the value for cityrange.CityEasyName
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public void setCityeasyname(String cityeasyname) {
        this.cityeasyname = cityeasyname == null ? null : cityeasyname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cityrange.Level
     *
     * @return the value of cityrange.Level
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cityrange.Level
     *
     * @param level the value for cityrange.Level
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cityrange.CityCode
     *
     * @return the value of cityrange.CityCode
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public String getCitycode() {
        return citycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cityrange.CityCode
     *
     * @param citycode the value for cityrange.CityCode
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cityrange.Pinyin
     *
     * @return the value of cityrange.Pinyin
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public String getPinyin() {
        return pinyin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cityrange.Pinyin
     *
     * @param pinyin the value for cityrange.Pinyin
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cityrange.Status
     *
     * @return the value of cityrange.Status
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cityrange.Status
     *
     * @param status the value for cityrange.Status
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cityrange.Sort
     *
     * @return the value of cityrange.Sort
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cityrange.Sort
     *
     * @param sort the value for cityrange.Sort
     *
     * @mbg.generated Tue Mar 06 15:51:25 CST 2018
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}