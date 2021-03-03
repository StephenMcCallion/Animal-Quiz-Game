package myPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class QuestionsModel {
	
	// Starter questions
	private final String question1 = "What is the name of this animal?";
	private final String question2 = "What type of animal is this?";
	private final String question3 = "What diet does this animal have?";
	private final String question4 = "A group of these animals are called?";
	private final String question5 = "Where is this animal native to?";
	// Harder Questions
	private final String question6 = "What is this animals top speed?";
	private final String question7 = "What is the average lifespan of this animal?";
	private final String question8 = "How many hours does this animal sleep for per day?";
	private final String question9 = "On average how much does this animal weigh?";
	private final String question10 = "How does this animal communicate?";
	protected int count;
	private String currentQuestionNo = "";
	
	public QuestionsModel(int count) {
		this.count = count;
		questions(count);
	}
	
	public String questions(int count) {
		if (count == 1) {
			this.currentQuestionNo = "Question 1";
			return question1;
		}
		else if (count == 2) {
			this.currentQuestionNo = "Question 2";
			return question2;
		}
		else if (count == 3) {
			this.currentQuestionNo = "Question 3";
			return question3;
		}
		else if (count == 4) {
			this.currentQuestionNo = "Question 4";
			return question4;
		}
		else if (count == 5) {
			this.currentQuestionNo = "Question 5";
			return question5;
		}
		else if (count == 6) {
			this.currentQuestionNo = "Question 6";
			return question6;
		}
		else if (count == 7) {
			this.currentQuestionNo = "Question 7";
			return question7;
		}
		else if (count == 8) {
			this.currentQuestionNo = "Question 8";
			return question8;
		}
		else if (count == 9) {
			this.currentQuestionNo = "Question 9";
			return question9;
		}
		else if (count == 10) {
			this.currentQuestionNo = "Question 10";
			return question10;
		}
		return null;
	}

	// returns the current question number
	public String getCurrentQuestionNo() {
		return currentQuestionNo;
	}
	
	
}
