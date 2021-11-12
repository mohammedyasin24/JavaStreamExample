package com.demo.streams;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
	
	public List<User> getUsersList()
	{
		List<User> userList = new ArrayList<>();
		userList.add(new User("Mohammed", "Yaseen", 27, "Male", "yaseen@gmail.com", "23456", "Dev"));
		userList.add(new User("Priyanka", "V", 27, "Female", "priyanka@gmail.com", "32425", "HR"));
		userList.add(new User("Mohammed", "Nafees", 18, "Male", "Nafees@gmail.com", "64545", "QA"));
		userList.add(new User("Mohammed", "Thasin", 26, "Male", "thasin@gmail.com", "87567", "Admin"));
		userList.add(new User("Keerthi", "Yaseen", 24, "Female", "keerthi@gmail.com", "68545", "Support"));
		userList.add(new User("Sumi", "T", 20, "Female", "sumi@gmail.com", "45654", "HR"));
		userList.add(new User("Arun", "Kumar", 35, "Male", "arun@gmail.com", "85645", "Dev"));
		userList.add(new User("Priya", "T", 36, "Female", "priya@gmail.com", "97576", "Dev"));
		userList.add(new User("Thaha", "Naseer", 21, "Male", "thaha@gmail.com", "23457", "QA"));
		userList.add(new User("Noor", "Mohammed", 19, "Male", "noor@gmail.com", "57657", "Admin"));
		return userList;
	}

}
