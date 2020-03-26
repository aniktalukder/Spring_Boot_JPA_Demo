package com.example.JPADemo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.JPADemo.JDBCDAO.EmployeesJDBCDAO;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{

	private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());	
	
	@Autowired
	EmployeesJDBCDAO dao;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("All Employees -> {}", dao.findAll());
		
	}

}
