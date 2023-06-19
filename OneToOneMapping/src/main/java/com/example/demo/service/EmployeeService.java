package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.entity.Employee;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	public Employee insert(Employee e) {

		return repo.save(e);
	}

}
