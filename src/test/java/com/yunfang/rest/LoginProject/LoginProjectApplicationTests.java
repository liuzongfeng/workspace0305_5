package com.yunfang.rest.LoginProject;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.yunfang.rest.LoginProject.mybatis.dao.eBillDao.CityrangeMapper;
import com.yunfang.rest.LoginProject.mybatis.model.eBillModel.Cityrange;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginProjectApplicationTests {

	@Autowired
	private CityrangeMapper cityrangeMapper;
	@Test
	public void contextLoads() {

		String aa = cityrangeMapper.searchCityName("110000");
		System.out.print(aa);

	}

}
