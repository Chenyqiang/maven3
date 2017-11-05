package com.itdragon.Test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itdragon.mapper.PersonMapper;
import com.itdragon.pojo.Person;

public class ConnectionDataTest {
	
	@Test
	public void testPageHelper() {
		// 创建一个spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		// 从spring容器中获得Mapper的代理对象
		PersonMapper mapper = applicationContext.getBean(PersonMapper.class);
		Person person = mapper.selectByPrimaryKey(1);
		System.out.println("Find One ： " + person.getEmail());

	}
}
