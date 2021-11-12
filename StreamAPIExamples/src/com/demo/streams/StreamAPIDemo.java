package com.demo.streams;


import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPIDemo {
	public static void main(String[] args) {
		UserRepository repo = new UserRepository();
		List<User> users = repo.getUsersList();
		
		// for each
		users.forEach(user -> System.out.println(user.toString()));
		
		// Map 
		appendCountryCode(users);
		
		// get lowest age
		getMinMaxAge(users);
		
		// filter - get users age < 25
		getUserByAgeLimit(users, 25);
		
		// grouping 
		getUsersByRole(users);
		
		sortByLastName(users);
		
	}
	
	public static void getUserByAgeLimit(List<User> users, int age)
	{
		List<User> filteredUsers = users.stream().filter(user -> user.getAge() < age).collect(Collectors.toList());
		filteredUsers.forEach(u -> System.out.println("Name: "+ u.getFirstName() + " " + u.getLastName() + " Age: " + u.getAge()));
	}
	
	public static void getUsersByRole(List<User> users)
	{
		Map<String, List<User>> map = users.stream().collect(Collectors.groupingBy(User::getRole, HashMap::new, Collectors.toList()));
		map.keySet().stream().forEach(key -> System.out.println("Key: "  + key + " Values: " + map.get(key)));
	}
	
	public static void sortByLastName(List<User> users)
	{
		users.stream().sorted(Comparator.comparing(User::getLastName)).collect(Collectors.toList()).forEach(u -> System.out.println(u.getLastName()));;
	}
	
	public static void appendCountryCode(List<User> users)
	{
		System.out.println(users.stream().map(u -> "+91" + u.getMobile()).collect(Collectors.toList()));
	}
	
	public static void getMinMaxAge(List<User> users)
	{
		Comparator<User> compByAge = (User u1, User u2) -> u1.getAge() - u2.getAge();
		System.out.println("Min Age User: " + users.stream().min(compByAge));
		System.out.println("Max Age User: " +users.stream().max(compByAge));
	}
	
}
