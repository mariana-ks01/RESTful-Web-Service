package com.qa.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table (name = "stu_details")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stu_id")
	private int id;
	
	@NotNull
	@Size(min = 2, max = 20, message = "name must be between 2-20 characters.")
	@Pattern(regexp = "^[A-Za-Z0-9]*", message = "invalid character, must contain only alphanumeric characters")
	@Column(name = "stu_fname")
	private String firstName;
	
	@NotNull
	@Size(min = 2, max = 20, message = "name must be between 2-20 characters.")
	@Pattern(regexp = "^[A-Za-Z0-9]*", message = "invalid character, must contain only alphanumeric characters")
	@Column(name = "stu_lname")
	private String surname;
	
	@NotNull
	@Min(18)	
	@Column(name = "stu_age")
	private int age;
	
	@NotNull
	@Pattern(regexp = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$", message = "Invalid email")
	@Column(name = "stu_email")
	private String email;
	
	@NotNull
	@Size(min = 2, max = 20, message = "name must be between 2-20 characters.")
	@Pattern(regexp = "^[A-Za-Z0-9]*", message = "invalid character, must contain only alphanumeric characters")
	@Column(name = "stu_subject")
	private String subject;
	
	@NotNull
	@Min(0)	
	@Column(name = "stu_fees")
	private Double fees;
}
