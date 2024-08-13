package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepository;
	
	public List<Employee> getAllEmployee(){
		return empRepository.findAll();
	}
	
	public Employee getEmployeeById(Long id) {
		return empRepository.findById(id).orElse(null);
	}
	
	public Employee saveEmployee(Employee employee) {
		return empRepository.save(employee);
	}
	
	public void deleteEmployee(Long id) {
		empRepository.deleteById(id);
	}
}
