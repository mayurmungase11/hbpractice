package com.example.SBpractice.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;




@Entity
@Getter
@Setter

//@Data

public class Employee {
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private String position;

	private double salary;
	
	@Email(message="Invalid email format")
	private String email;
	@Length(min=10,max=10,message="Mobile number must be 10 digits")
	private String mobile;
	
	@Length(min=8)
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", message="Password must contain at least one digit, one lowercase letter, one uppercase letter, one special character and no whitespace")
	private String password;
	
	
	// due to LOMBOK dependencies we dont need to write any getters or setters or any Constructor parameterised od default explicitly or namually here
	// Also we can use @Data annotation from lombok package at the class level to generate getters and setters automatically

	
	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getPosition() {
//		return position;
//	}
//	public void setPosition(String position) {
//		this.position = position;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getMobile() {
//		return mobile;
//	}
//	public void setMobile(String mobile) {
//		this.mobile = mobile;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
	

}
