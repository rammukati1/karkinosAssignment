package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.PatientsRepo;
import com.example.demo.model.Patients;

@RestController
public class ResourceController {
	
	@Autowired
	PatientsRepo repo;
	
	@RequestMapping("/")
	public String test() {
		return "hello";
	}
	
	@RequestMapping("/patients")
	public List<Patients> getAll() {
		
		return (List<Patients>) repo.findAll();
	}
}
