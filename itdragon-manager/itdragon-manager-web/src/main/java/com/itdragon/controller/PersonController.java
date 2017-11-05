package com.itdragon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itdragon.service.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/")
	public String personPage() {
		System.out.println("start web ");
		return "index";
	}
	
	@RequestMapping("/person/{personId}")
	@ResponseBody
	public String getPersonEmailById(@PathVariable("personId") Integer personId) {
		String email = null;
		try {
			email = personService.findOneById(personId).getEmail();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return email;
	}
	
	

}
