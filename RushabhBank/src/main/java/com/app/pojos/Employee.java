package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Employee {
	
//	private String id;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "ename")
	private String name;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "mobilenumber")
	private String mobileno;

	@Override
	public String toString() {
		return "Employee [ id= "+id+" name=" + name + ", address=" + address + ", mobileno=" + mobileno + "]";
	}
	
}
