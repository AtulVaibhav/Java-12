package com.quizApp;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to QUIZ APP");
		System.out.println("================================");
		System.out.println("Enter as :1.Admin   2.Player");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			UserResponse response = UserUtil.dologin(sc);
			if (response.isStatus()) {
				QuizUtil.addData(sc);
				break;
			}
		case 2:
			System.out.println("1.NewPlayer   2.RegisteredPlayer");
			int userInput = sc.nextInt();
			switch (userInput) {
			case 1:
				UserResponse doRegister = UserUtil.doRegistration(sc);
				if(doRegister.isStatus()) {
					GameCode.techQuiz(doRegister.getUserName());
				}
				break;
			case 2:
				UserResponse doLogin = UserUtil.dologin(sc);
				if(doLogin.isStatus()) {
					GameCode.techQuiz(doLogin.getUserName());
				}
				break;
				
		    default:System.out.println("Invalid option");
		        break;
			}
			
			
		}
      System.out.println("Thank You");
	}

}
