package com.students.domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Date;


public class Student {
	
	private Integer id;
	@NotEmpty(message ="{firstNameEmpty}")
	@Size(min = 4, max = 50, message ="{firstName.Size.validator}")
 	private String firstName = null;
	@NotEmpty(message ="{lastName.Size.validator}")
 	private String lastName  = null;
	@Email(message = "{email.validator}")
 	private String email = null;
	
 	private String gender = null;

	@DateTimeFormat(pattern = "MM-dd-yyyy")
    private Date birthday;
	@Valid
	private Phone phone;

  	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}	
	   	
	   

}
