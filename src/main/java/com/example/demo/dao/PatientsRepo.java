package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Patients;

public interface PatientsRepo  extends CrudRepository <Patients , Integer>{
 
}
