package com.example.JPADemo.JDBCDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.JPADemo.entity.Employee;

@Repository
public class EmployeesJDBCDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	//Returns all employees -> select * from EMPLOYEES
	public List<Employee> findAll(){
		
		 return jdbcTemplate.query("select * from EMPLOYEES where employee_id = 121", 
				 					new BeanPropertyRowMapper(Employee.class));
	}
}
