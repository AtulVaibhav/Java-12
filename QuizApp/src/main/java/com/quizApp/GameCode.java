package com.quizApp;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

public class GameCode {
    static int score =0;
   
    
    private static List<Question> fetchQuestions(){
       Session session = AppConfig.getSessionFactory().openSession();
       String sql = "from Question";
       Query<Question> query = session.createQuery(sql);
       return query.list();
    }
    
    
    
    public static void techQuiz(String username) {
    	System.out.println("Welcome "+username);
    	Scanner sc = new Scanner(System.in);
    	
    	Session session = AppConfig.getSessionFactory().openSession();
    	for(int i=0;i<fetchQuestions().size();i++) {
    		System.out.println("Q"+(i+1)+". "+fetchQuestions().get(i).getQuestionName());
    		System.out.print("a."+fetchQuestions().get(i).getOptions().getOption1()+"   ");
    		System.out.print("b."+fetchQuestions().get(i).getOptions().getOption2()+"   ");
    		System.out.print("c."+fetchQuestions().get(i).getOptions().getOption3()+"   ");
    		System.out.print("d."+fetchQuestions().get(i).getOptions().getOption4()+"   ");
    		System.out.println();
    		System.out.println("Enter your answer");
    		String userAnswer = sc.next();
    		if(userAnswer.equals(fetchQuestions().get(i).getAnswer().getCorrectAnswer())) {
    			System.out.println("correct answer");
    			score++;
    			
    		}else {
    			System.out.println("wrong answer");
    			break;
    		}
    	}
    	
    	System.out.println("Your total score :"+score);
    	
    }
}
