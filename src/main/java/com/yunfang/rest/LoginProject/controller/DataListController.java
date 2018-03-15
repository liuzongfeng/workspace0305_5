package com.yunfang.rest.LoginProject.controller;

import com.yunfang.rest.LoginProject.mybatis.dao.eBillDao.CityrangeMapper;
import com.yunfang.rest.LoginProject.mybatis.model.ResultModel;
import com.yunfang.rest.LoginProject.mybatis.model.eBillModel.AnliData;
import com.yunfang.rest.LoginProject.mybatis.model.eBillModel.BasicData;
import com.yunfang.rest.LoginProject.mybatis.model.eBillModel.Cityrange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static sun.security.krb5.Confounder.intValue;

@RestController
public class DataListController {

    @Autowired
    private CityrangeMapper cityrangeMapper;


    public Cityrange obtainDataSum(){

        List<Map> maps = cityrangeMapper.obtainDataSum();
        //构造List<Cityrange>
        AnliData anli = new AnliData();
        anli.setAzsChengjiao(Integer.parseInt(maps.get(0).get("azsChengjiao").toString()));
        anli.setAzzChengjiao(Integer.parseInt(maps.get(0).get("azzChengjiao").toString()) );
        anli.setAzsGuapai(Integer.parseInt( maps.get(0).get("azsGuapai").toString()));
        anli.setAzzGuapai( Integer.parseInt(maps.get(0).get("azzGuapai").toString()) );
        anli.setAfzsGuapai(Integer.parseInt(maps.get(0).get("afzsGuapai").toString()) );
        anli.setAfzzGuapai(Integer.parseInt(maps.get(0).get("afzzGuapai").toString()));

        BasicData bd = new BasicData();
        bd.setjZhoubianpeitao(Integer.parseInt(maps.get(0).get("jZhoubianpeitao").toString()));
        bd.setjXiaoqupingji(Integer.parseInt(maps.get(0).get("jXiaoqupingji").toString()));
        bd.setjJichushuliang(Integer.parseInt(maps.get(0).get("jJichushuliang").toString()));
        bd.setjZhishu(Integer.parseInt(maps.get(0).get("jZhishu").toString()));

        Cityrange ci = new Cityrange();
        ci.setCityname("覆盖城市数量");
        ci.setAnliData(anli);
        ci.setBasicData(bd);




        return ci;


    }
    /**
     *
     * @param cityNameParam
     * @return
     */
    @RequestMapping("/obtainDataList")
    @ResponseBody
    public ResultModel queryDataList(String cityNameParam){
       List<Cityrange> c = cityrangeMapper.queryDataList(cityNameParam);
       if(null == cityNameParam || "".equals(cityNameParam)){
           Cityrange ci = obtainDataSum();
           c.add(0,ci);
       }
        ResultModel r = new ResultModel();
        r.setCode(0);
        r.setCount(10000);
        r.setMsg("");
        r.setData(c);
        return r;
    }
}
