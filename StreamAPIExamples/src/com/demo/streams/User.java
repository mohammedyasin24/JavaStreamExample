package com.demo.streams;

public class User {

	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String email;
	private String mobile;
	private String role;

	public User(String firstName, String secondName, int age, String gender, String email, String mobile, String role) {
		super();
		this.firstName = firstName;
		this.lastName = secondName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		this.role = role;
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

	public void setLastName(String secondName) {
		this.lastName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [Name=" + firstName + " " + lastName + ", age=" + age + ", gender=" + gender
				+ ", email=" + email + ", mobile=" + mobile + ", role=" + role + "]";
	}

}
