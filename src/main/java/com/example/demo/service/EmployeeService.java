package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository er;
	
	public Employee create(Employee employee) {
		return er.save(employee);
	}
	public List<Employee> read() {
		return er.findAll();
	}
	public Employee read(Long id) {
		Optional<Employee> x = er.findById(id);
		Employee employee=null;
		if(x.isPresent())
		{
			employee=x.get();
		}
		return employee;
	}
	public Employee update(Employee employee) {
		return er.save(employee);
	}
	public Employee delete(Long id) {
		Optional<Employee> x = er.findById(id);
		Employee employee=null;
		if(x.isPresent())
		{
			employee=x.get();
			er.delete(employee);
		}
		return employee;
	}
	
}
