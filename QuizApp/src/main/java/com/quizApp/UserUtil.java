package com.quizApp;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

public class UserUtil {
    
	
	public static UserResponse doRegistration(Scanner sc) {
		Session session = AppConfig.getSessionFactory().openSession();
		System.out.println("Enter the username");
		String username = sc.next();
		System.out.println("Create your password");
		String password = sc.next();
		User newUser = new User();
		newUser.setUsername(username);
		newUser.setPassword(password);
		
		session.beginTransaction();
		session.save(newUser);
		session.getTransaction().commit();
		UserResponse userResponse = new UserResponse(username,true);
		
		return userResponse;	
	}
	public static UserResponse dologin(Scanner sc) {
		Session session = AppConfig.getSessionFactory().openSession();
		System.out.println("Enter the username");
		String username = sc.next();
		System.out.println("Enter your password");
		String password = sc.next();
		String sql = "from User where username=:username";
		Query<User> query = session.createQuery(sql);
		query.setString("username",username);
		User user = (User) query.uniqueResult();
		if(user.getPassword().equalsIgnoreCase(password)) {
			UserResponse response = new UserResponse(username, true);
		    session.close();
			return response;
		}
		session.close();
		return null;
	}
}
