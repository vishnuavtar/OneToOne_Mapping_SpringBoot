package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empid;
	private String empName;
	private String empEmail;
	
	
	@Autowired
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@Autowired
	@OneToOne(cascade = CascadeType.ALL)
	private Company company;
}
