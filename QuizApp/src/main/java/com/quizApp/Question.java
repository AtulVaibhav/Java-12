package com.quizApp;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	private String questionId;
	private String questionName;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy="question")
	private Option options;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy="question")
	private Answer answer;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public Option getOptions() {
		return options;
	}

	public void setOptions(Option options) {
		this.options = options;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

}
