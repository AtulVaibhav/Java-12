package com.quizApp;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QuizUtil {
	
	public static void addData(Scanner sc) {
		char resp;
		Session s = AppConfig.getSessionFactory().openSession();
		do {
			System.out.println("Enter the question id:");
			String quesId = sc.next();
			sc.nextLine();
			System.out.println("Enter the question:");
			String question = sc.nextLine();
			Question q = new Question();
			q.setQuestionId(quesId);
			q.setQuestionName(question);
			
			
			System.out.println("Enter the 1st option:");
			String option1 = sc.next();
			
			System.out.println("Enter the 2nd option:");
			String option2 = sc.next();
			
			System.out.println("Enter the 3rd option:");
			String option3 = sc.next();
			
			System.out.println("Enter the 4th option:");
			String option4 = sc.next();
			
			Option o = new Option();
			o.setOption1(option1);
			o.setOption2(option2);
			o.setOption3(option3);
			o.setOption4(option4);
			
		    q.setOptions(o);
		    o.setQuestion(q);
		    
		    
		    System.out.println("Enter the correct answer:");
		    String answer = sc.next();
		    
		    Answer ans = new Answer();
		    ans.setCorrectAnswer(answer);
		    q.setAnswer(ans);
		    ans.setQuestion(q);
		    
		    
		    s.beginTransaction();
		    s.save(q);
		    s.getTransaction().commit();
		    System.out.println("Question added successfully");
		    
		    System.out.println("Do you want to continue?y/n");
		    resp = sc.next().charAt(0);
		}while(resp=='y');
		s.close();
		System.out.println("Thank you!!!");
		
	}

}
