package com.itdragon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itdragon.mapper.PersonMapper;
import com.itdragon.pojo.Person;
import com.itdragon.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonMapper personMapper;

	@Override
	public Person findOneById(Integer id) {
		return personMapper.selectByPrimaryKey(id);
	}

}
